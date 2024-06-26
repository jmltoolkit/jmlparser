package com.github.javaparser.ast.jml.clauses;

import com.github.javaparser.GeneratedJavaParserConstants;
import com.github.javaparser.JavaToken;
import com.github.javaparser.ast.jml.JmlKeyword;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Optional;

public enum JmlClauseKind implements JmlKeyword {

    ENSURES(GeneratedJavaParserConstants.ENSURES),
    ENSURES_FREE(GeneratedJavaParserConstants.ENSURES_FREE),
    ENSURES_REDUNDANTLY(GeneratedJavaParserConstants.ENSURES_REDUNDANTLY),
    REQUIRES(GeneratedJavaParserConstants.REQUIRES),
    REQUIRES_FREE(GeneratedJavaParserConstants.REQUIRES_FREE),
    REQUIRES_REDUNDANTLY(GeneratedJavaParserConstants.REQUIRES_REDUNDANTLY),
    DECREASES(GeneratedJavaParserConstants.DECREASES),
    MODIFIES(GeneratedJavaParserConstants.MODIFIES),
    MODIFIABLE(GeneratedJavaParserConstants.MODIFIABLE),
    ASSIGNABLE(GeneratedJavaParserConstants.ASSIGNABLE),
    ACCESSIBLE(GeneratedJavaParserConstants.ACCESSIBLE),
    PRE(GeneratedJavaParserConstants.PRE),
    POST(GeneratedJavaParserConstants.POST),
    PRE_REDUNDANTLY(GeneratedJavaParserConstants.PRE_REDUNDANTLY),
    POST_REDUNDANTLY(GeneratedJavaParserConstants.POST_REDUNDANTLY),
    MAINTAINING(GeneratedJavaParserConstants.MAINTAINING),
    MAINTAINING_REDUNDANTLY(GeneratedJavaParserConstants.MAINTAINING_REDUNDANTLY),
    DECREASING(GeneratedJavaParserConstants.DECREASES),
    DECREASES_REDUNDANTLY(GeneratedJavaParserConstants.DECREASES_REDUNDANTLY),
    LOOP_INVARIANT(GeneratedJavaParserConstants.LOOP_INVARIANT),
    LOOP_INVARIANT_FREE(GeneratedJavaParserConstants.LOOP_INVARIANT_FREE),
    LOOP_INVARIANT_REDUNDANTLY(GeneratedJavaParserConstants.LOOP_INVARIANT_REDUNDANTLY),
    MEASURED_BY(GeneratedJavaParserConstants.MEASURED_BY),
    RETURNS(GeneratedJavaParserConstants.RETURNS),
    RETURNS_REDUNDANTLY(GeneratedJavaParserConstants.RETURNS_REDUNDANTLY),
    BREAKS(GeneratedJavaParserConstants.BREAKS),
    BREAKS_REDUNDANTLY(GeneratedJavaParserConstants.BREAKS_REDUNDANTLY),
    CONTINUES(GeneratedJavaParserConstants.CONTINUES),
    CONTINUES_REDUNDANTLY(GeneratedJavaParserConstants.CONTINUES_REDUNDANTLY),
    OLD(GeneratedJavaParserConstants.OLD),
    FORALL(GeneratedJavaParserConstants.FORALL),
    SIGNALS(GeneratedJavaParserConstants.SIGNALS),
    SIGNALS_REDUNDANTLY(GeneratedJavaParserConstants.SIGNALS_REDUNDANTLY),
    SIGNALS_ONLY(GeneratedJavaParserConstants.SIGNALS_ONLY),
    WHEN(GeneratedJavaParserConstants.WHEN),
    WORKING_SPACE(GeneratedJavaParserConstants.WORKING_SPACE),
    WORKING_SPACE_REDUNDANTLY(GeneratedJavaParserConstants.WORKING_SPACE_REDUNDANTLY),
    CAPTURES(GeneratedJavaParserConstants.CAPTURES),
    CAPTURES_REDUNDANTLY(GeneratedJavaParserConstants.CAPTURES_REDUNDANTLY),
    INITIALLY(GeneratedJavaParserConstants.INITIALLY),
    INVARIANT_REDUNDANTLY(GeneratedJavaParserConstants.INVARIANT_REDUNDANTLY),
    INVARIANT(GeneratedJavaParserConstants.INVARIANT),
    ASSIGNABLE_REDUNDANTLY(GeneratedJavaParserConstants.ASSIGNABLE_REDUNDANTLY),
    MODIFIABLE_REDUNDANTLY(GeneratedJavaParserConstants.MODIFIABLE_REDUNDANTLY),
    MODIFIES_REDUNDANTLY(GeneratedJavaParserConstants.MODIFIES_REDUNDANTLY),
    CALLABLE(GeneratedJavaParserConstants.CALLABLE),
    CALLABLE_REDUNDANTLY(GeneratedJavaParserConstants.CALLABLE_REDUNDANTLY),
    DIVERGES(GeneratedJavaParserConstants.DIVERGES),
    DIVERGES_REDUNDANTLY(GeneratedJavaParserConstants.DIVERGES_REDUNDANTLY),
    DURATION(GeneratedJavaParserConstants.DURATION),
    DURATION_REDUNDANTLY(GeneratedJavaParserConstants.DURATION_REDUNDANTLY),
    NONE(-1);

    public final String jmlSymbol;

    private final int tokenType;

    JmlClauseKind(int tokenType) {
        this.tokenType = tokenType;
        jmlSymbol = name().toLowerCase();
    }

    JmlClauseKind(String jmlSymbol, int tokenType) {
        this.jmlSymbol = jmlSymbol;
        this.tokenType = tokenType;
    }

    @Override
    public String jmlSymbol() {
        return jmlSymbol;
    }

    public static JmlClauseKind getKindByToken(JavaToken token) {
        Optional<JmlClauseKind> k = Arrays.stream(JmlClauseKind.values()).filter(it -> it.jmlSymbol.equals(token.getText())).findFirst();
        if (k.isPresent()) {
            return k.get();
        } else {
            throw new IllegalArgumentException("Could not find clause kind for: " + token.getText());
        }
    }
}
