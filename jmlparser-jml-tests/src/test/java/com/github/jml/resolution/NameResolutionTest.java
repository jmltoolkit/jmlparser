package com.github.jml.resolution;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.Problem;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.jml.expr.JmlQuantifiedExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.resolution.UnsolvedSymbolException;
import com.github.javaparser.resolution.declarations.AssociableToAST;
import com.github.javaparser.symbolsolver.JavaRefersToJmlException;
import com.github.javaparser.symbolsolver.JavaSymbolSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.ClassLoaderTypeSolver;
import com.google.common.truth.Truth;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Alexander Weigl
 * @version 1 (02.07.22)
 */
class NameResolutionTest {
    @Test
    void contractMemberVariable() throws IOException {
        loadAndResolveAll("ResolutionTest.java");
    }

    @Test
    void complete() throws IOException {
        loadAndResolveAll("CompleteResolutionExample.java");
    }


    @Test
    void jmlBinderExpression() throws IOException {
        loadAndResolveAll("JmlQuantifiedExprResolutionTest.java");
    }

    @Test
    void jmlBinderExpression_static() throws IOException {
        loadAndResolveAll("JmlQuantifiedExprResolutionStaticTest.java");
    }

    @Test
    void locals() throws IOException {
        loadAndResolveAll("Locals.java");
    }


    private void loadAndResolveAll(String name) throws IOException {
        final ParserConfiguration configuration = new ParserConfiguration().setProcessJml(true);
        configuration.setSymbolResolver(new JavaSymbolSolver(new ClassLoaderTypeSolver(ClassLoader.getSystemClassLoader())));
        JavaParser parser = new JavaParser(configuration);
        final File file = new File("src/test/resources/com/github/jml/resolution/" + name)
                .getAbsoluteFile();
        ParseResult<CompilationUnit> cu = parser.parse(file);
        if (!cu.isSuccessful()) {
            for (Problem problem : cu.getProblems()) {
                System.out.println(problem);
            }
            Assertions.fail("Errors during parsing");
        }


        final ResolveAllVisitor v = new ResolveAllVisitor();
        cu.getResult().get().accept(v, null);

        Set<String> errorLines = Files.readAllLines(file.toPath()).stream()
                .filter(it -> it.trim().startsWith("//?"))
                .map(it -> it.trim().substring(4).trim())
                .collect(Collectors.toSet());

        errorLines.stream().sorted().forEach(errorLine ->
                System.out.format("//? %s%n", errorLine));

        v.messages.stream().sorted().forEach(errorLine ->
                System.out.format("//? %s%n", errorLine));

        Truth.assertThat(v.messages).isEqualTo(errorLines);
    }

    private static class ResolveAllVisitor extends VoidVisitorAdapter<Void> {
        final Set<String> messages = new HashSet<>();

        @Override
        public void visit(NameExpr n, Void arg) {
            String pos = n.getRange().map(it -> it.begin.toString()).orElse("_");
            try {
                var rtype = n.resolve();

                var t = ((AssociableToAST<Node>) rtype).toAst().get();
                var target = t.getRange().map(it -> it.begin.toString()).orElse("_");

                messages.add("name: %s@%s to %s@%s"
                        .formatted(n.getNameAsString(), pos,
                                rtype.getName(), target));
                try {
                    n.calculateResolvedType();
                    messages.add("type: %s@%s"
                            .formatted(n.getNameAsString(), pos));
                } catch (UnsolvedSymbolException e) {
                    messages.add("e type: %s@%s"
                            .formatted(n.getNameAsString(), pos));
                }
            } catch (JavaRefersToJmlException e) {
                messages.add("e java2jml: %s@%s"
                        .formatted(n.getNameAsString(), pos));
            } catch (UnsolvedSymbolException e) {
                messages.add("e name: %s@%s"
                        .formatted(n.getNameAsString(), pos));
            }
        }

        @Override
        public void visit(JmlQuantifiedExpr n, Void arg) {
            super.visit(n, arg);
        }
    }
}
