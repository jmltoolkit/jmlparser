package com.github.javaparser.ast.jml.clauses;

import java.util.EnumSet;
import static com.github.javaparser.ast.jml.clauses.JmlClauseKind.*;

/**
 * @author Alexander Weigl
 * @version 1 (04.05.24)
 */
public enum ContractType {

    METHOD(ENSURES, ENSURES_FREE, ENSURES_REDUNDANTLY, REQUIRES, REQUIRES_FREE, REQUIRES_REDUNDANTLY, DECREASES, MODIFIES, MODIFIABLE, ASSIGNABLE, ACCESSIBLE, PRE, POST, OLD, FORALL, SIGNALS, SIGNALS_ONLY, WHEN, WORKING_SPACE, CAPTURES, ASSIGNABLE_REDUNDANTLY, MODIFIABLE_REDUNDANTLY, MODIFIES_REDUNDANTLY, CAPTURES_REDUNDANTLY, CALLABLE, DIVERGES, DURATION),
    LOOP(ENSURES, ENSURES_FREE, ENSURES_REDUNDANTLY, REQUIRES, REQUIRES_FREE, REQUIRES_REDUNDANTLY, DECREASES, MODIFIES, MODIFIABLE, ASSIGNABLE, ACCESSIBLE, PRE, POST, RETURNS, BREAKS, CONTINUES, OLD, FORALL, SIGNALS, SIGNALS_ONLY, WHEN, WORKING_SPACE, CAPTURES, ASSIGNABLE_REDUNDANTLY, MODIFIABLE_REDUNDANTLY, MODIFIES_REDUNDANTLY, CAPTURES_REDUNDANTLY, CALLABLE, DIVERGES, DURATION),
    LOOP_INV(LOOP_INVARIANT, LOOP_INVARIANT_FREE, LOOP_INVARIANT_REDUNDANTLY, ASSIGNABLE, ASSIGNABLE_REDUNDANTLY),
    BLOCK(ENSURES, ENSURES_FREE, ENSURES_REDUNDANTLY, REQUIRES, REQUIRES_FREE, REQUIRES_REDUNDANTLY, DECREASES, MODIFIES, MODIFIABLE, ASSIGNABLE, ACCESSIBLE, PRE, POST, RETURNS, BREAKS, CONTINUES, OLD, FORALL, SIGNALS, SIGNALS_ONLY, WHEN, WORKING_SPACE, CAPTURES, ASSIGNABLE_REDUNDANTLY, MODIFIABLE_REDUNDANTLY, MODIFIES_REDUNDANTLY, CAPTURES_REDUNDANTLY, CALLABLE, DIVERGES, DURATION),
    STATEMENT(ENSURES, ENSURES_FREE, ENSURES_REDUNDANTLY, REQUIRES, REQUIRES_FREE, REQUIRES_REDUNDANTLY, DECREASES, MODIFIES, MODIFIABLE, ASSIGNABLE, ACCESSIBLE, PRE, POST, RETURNS, BREAKS, CONTINUES, OLD, FORALL, SIGNALS, SIGNALS_ONLY, WHEN, WORKING_SPACE, CAPTURES, ASSIGNABLE_REDUNDANTLY, MODIFIABLE_REDUNDANTLY, MODIFIES_REDUNDANTLY, CAPTURES_REDUNDANTLY, CALLABLE, DIVERGES, DURATION),
    LAMBDA(ENSURES, ENSURES_FREE, ENSURES_REDUNDANTLY, REQUIRES, REQUIRES_FREE, REQUIRES_REDUNDANTLY, DECREASES, MODIFIES, MODIFIABLE, ASSIGNABLE, ACCESSIBLE, PRE, POST, OLD, FORALL, SIGNALS, SIGNALS_ONLY, WHEN, WORKING_SPACE, CAPTURES, ASSIGNABLE_REDUNDANTLY, MODIFIABLE_REDUNDANTLY, MODIFIES_REDUNDANTLY, CAPTURES_REDUNDANTLY, CALLABLE, DIVERGES, DURATION);

    final EnumSet<JmlClauseKind> validKinds;

    ContractType(JmlClauseKind first, JmlClauseKind... kinds) {
        validKinds = EnumSet.of(first, kinds);
    }

    public boolean isValidClauseKind(JmlClauseKind clauseKind) {
        return validKinds.contains(clauseKind);
    }
}
