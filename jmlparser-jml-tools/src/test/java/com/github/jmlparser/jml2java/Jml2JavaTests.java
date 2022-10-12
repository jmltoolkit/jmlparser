package com.github.jmlparser.jml2java;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.printer.DefaultPrettyPrinter;
import com.github.javaparser.symbolsolver.JavaSymbolSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.ClassLoaderTypeSolver;
import com.github.jmlparser.smt.SMTFacade;
import com.github.jmlparser.smt.SmtQuery;
import com.github.jmlparser.smt.model.SExpr;
import com.google.common.truth.Truth;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * @author Alexander Weigl
 * @version 1 (04.10.22)
 */
public class Jml2JavaTests {
    private final JavaParser parser;
    private final Node parent;

    {
        ParserConfiguration config = new ParserConfiguration();
        config.setSymbolResolver(new JavaSymbolSolver(new ClassLoaderTypeSolver(ClassLoader.getSystemClassLoader())));
        parser = new JavaParser(config);

        ParseResult<CompilationUnit> r = parser.parse(getClass().getResourceAsStream("Test.java"));
        if (!r.isSuccessful()) {
            r.getProblems().forEach(System.err::println);
            fail("Error during parsing");
        }
        parent = r.getResult().get().getType(0);
    }

    @TestFactory
    public Stream<DynamicTest> j2jTranslation() throws IOException {
        try (InputStream inputStream = getClass().getResourceAsStream("expr.yaml")) {
            Yaml yaml = new Yaml();
            List<Map<String, Object>> obj = yaml.load(inputStream);
            return obj.stream().map(m -> {
                String a = (String) m.get("expr");
                String result = (String) m.get("result");
                return DynamicTest.dynamicTest(a, () -> {
                    if (result != null)
                        jml2JavaTranslation(a, result);
                });
            });
        }
    }

    void jml2JavaTranslation(String input, String expected) {
        ParseResult<Expression> e = parser.parseJmlExpression(input);
        if (!e.isSuccessful()) {
            e.getProblems().forEach(System.err::println);
            fail("Error during parsing");
        }
        Expression expr = e.getResult().get();
        expr.setParentNode(parent);
        var actual = Jml2JavaFacade.translate(expr);

        DefaultPrettyPrinter dpp = new DefaultPrettyPrinter();
        var sblock = dpp.print(actual.a);
        var sexpr = dpp.print(actual.b);
        Truth.assertThat(trimAllWs(sblock + " " + sexpr))
                .isEqualTo(trimAllWs(expected));
    }

    private static String trimAllWs(String expected) {
        return expected.replaceAll("\\s+", " ").trim();
    }
}