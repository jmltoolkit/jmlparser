/*
 * Copyright (C) 2007-2010 Júlio Vilmar Gesser.
 * Copyright (C) 2011, 2013-2024 The JavaParser Team.
 *
 * This file is part of JavaParser.
 *
 * JavaParser can be used either under the terms of
 * a) the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 * b) the terms of the Apache License
 *
 * You should have received a copy of both licenses in LICENCE.LGPL and
 * LICENCE.APACHE. Please refer to those files for details.
 *
 * JavaParser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 */
package com.github.javaparser.ast.stmt;

import com.github.javaparser.TokenRange;
import com.github.javaparser.ast.AllFieldsConstructor;
import com.github.javaparser.ast.Generated;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.jml.doc.JmlDocStmt;
import com.github.javaparser.ast.jml.stmt.*;
import com.github.javaparser.ast.visitor.CloneVisitor;
import com.github.javaparser.metamodel.JavaParserMetaModel;
import com.github.javaparser.metamodel.StatementMetaModel;
import java.util.Optional;
import java.util.function.Consumer;
import static com.github.javaparser.utils.CodeGenerationUtils.f;

/**
 * A base class for all statements.
 *
 * @author Julio Vilmar Gesser
 */
public abstract class Statement extends Node {

    @AllFieldsConstructor
    public Statement() {
        this(null);
    }

    /**
     * This constructor is used by the parser and is considered private.
     */
    @Generated("com.github.javaparser.generator.core.node.MainConstructorGenerator")
    public Statement(TokenRange tokenRange) {
        super(tokenRange);
        customInitialization();
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.CloneGenerator")
    public Statement clone() {
        return (Statement) accept(new CloneVisitor(), null);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.GetMetaModelGenerator")
    public StatementMetaModel getMetaModel() {
        return JavaParserMetaModel.statementMetaModel;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isAssertStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public AssertStmt asAssertStmt() {
        throw new IllegalStateException(f("%s is not AssertStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isBlockStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public BlockStmt asBlockStmt() {
        throw new IllegalStateException(f("%s is not BlockStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isBreakStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public BreakStmt asBreakStmt() {
        throw new IllegalStateException(f("%s is not BreakStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isContinueStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public ContinueStmt asContinueStmt() {
        throw new IllegalStateException(f("%s is not ContinueStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isDoStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public DoStmt asDoStmt() {
        throw new IllegalStateException(f("%s is not DoStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isEmptyStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public EmptyStmt asEmptyStmt() {
        throw new IllegalStateException(f("%s is not EmptyStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isExplicitConstructorInvocationStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public ExplicitConstructorInvocationStmt asExplicitConstructorInvocationStmt() {
        throw new IllegalStateException(f("%s is not ExplicitConstructorInvocationStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isExpressionStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public ExpressionStmt asExpressionStmt() {
        throw new IllegalStateException(f("%s is not ExpressionStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isForStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public ForStmt asForStmt() {
        throw new IllegalStateException(f("%s is not ForStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isIfStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public IfStmt asIfStmt() {
        throw new IllegalStateException(f("%s is not IfStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isLabeledStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public LabeledStmt asLabeledStmt() {
        throw new IllegalStateException(f("%s is not LabeledStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isLocalClassDeclarationStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isLocalRecordDeclarationStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public LocalClassDeclarationStmt asLocalClassDeclarationStmt() {
        throw new IllegalStateException(f("%s is not LocalClassDeclarationStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public LocalRecordDeclarationStmt asLocalRecordDeclarationStmt() {
        throw new IllegalStateException(f("%s is not LocalRecordDeclarationStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isReturnStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public ReturnStmt asReturnStmt() {
        throw new IllegalStateException(f("%s is not ReturnStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isSwitchStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public SwitchStmt asSwitchStmt() {
        throw new IllegalStateException(f("%s is not SwitchStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isSynchronizedStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public SynchronizedStmt asSynchronizedStmt() {
        throw new IllegalStateException(f("%s is not SynchronizedStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isThrowStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public ThrowStmt asThrowStmt() {
        throw new IllegalStateException(f("%s is not ThrowStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isTryStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public TryStmt asTryStmt() {
        throw new IllegalStateException(f("%s is not TryStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isUnparsableStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public UnparsableStmt asUnparsableStmt() {
        throw new IllegalStateException(f("%s is not UnparsableStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isWhileStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public WhileStmt asWhileStmt() {
        throw new IllegalStateException(f("%s is not WhileStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifAssertStmt(Consumer<AssertStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifBlockStmt(Consumer<BlockStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifBreakStmt(Consumer<BreakStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifContinueStmt(Consumer<ContinueStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifDoStmt(Consumer<DoStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifEmptyStmt(Consumer<EmptyStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifExplicitConstructorInvocationStmt(Consumer<ExplicitConstructorInvocationStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifExpressionStmt(Consumer<ExpressionStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifForStmt(Consumer<ForStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifIfStmt(Consumer<IfStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifLabeledStmt(Consumer<LabeledStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifLocalClassDeclarationStmt(Consumer<LocalClassDeclarationStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifLocalRecordDeclarationStmt(Consumer<LocalRecordDeclarationStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifReturnStmt(Consumer<ReturnStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifSwitchStmt(Consumer<SwitchStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifSynchronizedStmt(Consumer<SynchronizedStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifThrowStmt(Consumer<ThrowStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifTryStmt(Consumer<TryStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifUnparsableStmt(Consumer<UnparsableStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifWhileStmt(Consumer<WhileStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<AssertStmt> toAssertStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<BlockStmt> toBlockStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<BreakStmt> toBreakStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<ContinueStmt> toContinueStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<DoStmt> toDoStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<EmptyStmt> toEmptyStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<ExplicitConstructorInvocationStmt> toExplicitConstructorInvocationStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<ExpressionStmt> toExpressionStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<ForStmt> toForStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<IfStmt> toIfStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<LabeledStmt> toLabeledStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<LocalClassDeclarationStmt> toLocalClassDeclarationStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<LocalRecordDeclarationStmt> toLocalRecordDeclarationStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<ReturnStmt> toReturnStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<SwitchStmt> toSwitchStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<SynchronizedStmt> toSynchronizedStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<ThrowStmt> toThrowStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<TryStmt> toTryStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<UnparsableStmt> toUnparsableStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<WhileStmt> toWhileStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isForEachStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public ForEachStmt asForEachStmt() {
        throw new IllegalStateException(f("%s is not ForEachStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<ForEachStmt> toForEachStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifForEachStmt(Consumer<ForEachStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isYieldStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public YieldStmt asYieldStmt() {
        throw new IllegalStateException(f("%s is not YieldStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<YieldStmt> toYieldStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifYieldStmt(Consumer<YieldStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isJmlAssertStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public JmlExpressionStmt asJmlAssertStmt() {
        throw new IllegalStateException(f("%s is not JmlAssertStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<JmlExpressionStmt> toJmlAssertStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifJmlAssertStmt(Consumer<JmlExpressionStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isJmlAssumeStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isJmlSetStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isUnreachableStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public JmlUnreachableStmt asUnreachableStmt() {
        throw new IllegalStateException(f("%s is not UnreachableStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<JmlUnreachableStmt> toUnreachableStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifUnreachableStmt(Consumer<JmlUnreachableStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isJmlDebugStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isJmlHenceByStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isJmlRefiningStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public JmlRefiningStmt asJmlRefiningStmt() {
        throw new IllegalStateException(f("%s is not JmlRefiningStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<JmlRefiningStmt> toJmlRefiningStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifJmlRefiningStmt(Consumer<JmlRefiningStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isJmlStatement() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public JmlStatement asJmlStatement() {
        throw new IllegalStateException(f("%s is not JmlStatement, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<JmlStatement> toJmlStatement() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifJmlStatement(Consumer<JmlStatement> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isJmlStatements() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isJmlUnreachableStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public JmlUnreachableStmt asJmlUnreachableStmt() {
        throw new IllegalStateException(f("%s is not JmlUnreachableStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<JmlUnreachableStmt> toJmlUnreachableStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifJmlUnreachableStmt(Consumer<JmlUnreachableStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isJmlStmtWithExpression() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public JmlExpressionStmt asJmlStmtWithExpression() {
        throw new IllegalStateException(f("%s is not JmlStmtWithExpression, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<JmlExpressionStmt> toJmlStmtWithExpression() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifJmlStmtWithExpression(Consumer<JmlExpressionStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isJmlGhostStatements() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public JmlGhostStmt asJmlGhostStatements() {
        throw new IllegalStateException(f("%s is not JmlGhostStatements, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<JmlGhostStmt> toJmlGhostStatements() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifJmlGhostStatements(Consumer<JmlGhostStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isJmlDocStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public JmlDocStmt asJmlDocStmt() {
        throw new IllegalStateException(f("%s is not JmlDocStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<JmlDocStmt> toJmlDocStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifJmlDocStmt(Consumer<JmlDocStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isJmlGhostStatement() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public JmlGhostStmt asJmlGhostStatement() {
        throw new IllegalStateException(f("%s is not JmlGhostStatement, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<JmlGhostStmt> toJmlGhostStatement() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifJmlGhostStatement(Consumer<JmlGhostStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isJmlBeginStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public JmlBeginStmt asJmlBeginStmt() {
        throw new IllegalStateException(f("%s is not JmlBeginStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<JmlBeginStmt> toJmlBeginStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifJmlBeginStmt(Consumer<JmlBeginStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isJmlEndStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public JmlEndStmt asJmlEndStmt() {
        throw new IllegalStateException(f("%s is not JmlEndStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<JmlEndStmt> toJmlEndStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifJmlEndStmt(Consumer<JmlEndStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isJmlExpressionStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public JmlExpressionStmt asJmlExpressionStmt() {
        throw new IllegalStateException(f("%s is not JmlExpressionStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<JmlExpressionStmt> toJmlExpressionStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifJmlExpressionStmt(Consumer<JmlExpressionStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isJmlGhostStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public JmlGhostStmt asJmlGhostStmt() {
        throw new IllegalStateException(f("%s is not JmlGhostStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<JmlGhostStmt> toJmlGhostStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifJmlGhostStmt(Consumer<JmlGhostStmt> action) {
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isJmlLabelStmt() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public JmlLabelStmt asJmlLabelStmt() {
        throw new IllegalStateException(f("%s is not JmlLabelStmt, it is %s", this, this.getClass().getSimpleName()));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<JmlLabelStmt> toJmlLabelStmt() {
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifJmlLabelStmt(Consumer<JmlLabelStmt> action) {
    }
}
