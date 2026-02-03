package com.github.javaparser.ast.jml.doc;

import static com.github.javaparser.utils.Utils.assertNotNull;

import com.github.javaparser.JavaToken;
import com.github.javaparser.TokenRange;
import com.github.javaparser.ast.AllFieldsConstructor;
import com.github.javaparser.ast.Generated;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.observer.ObservableProperty;
import com.github.javaparser.ast.visitor.CloneVisitor;
import com.github.javaparser.ast.visitor.GenericVisitor;
import com.github.javaparser.ast.visitor.VoidVisitor;
import com.github.javaparser.metamodel.JavaParserMetaModel;
import com.github.javaparser.metamodel.JmlDocMetaModel;
import java.util.Objects;
import org.jspecify.annotations.NonNull;

/**
 * @author Alexander Weigl
 * @version 1 (11/23/21)
 */
public class JmlDoc extends Node {
    private String content;

    public JmlDoc(JavaToken content) {
        this(new TokenRange(content, content), content.getText());
    }

    private static JavaToken getContent(JavaToken content) {
        return content;
    }

    @AllFieldsConstructor
    public JmlDoc(String content) {
        this(null, content);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.AcceptGenerator")
    public <R, A> R accept(final GenericVisitor<R, A> v, final A arg) {
        return v.visit(this, arg);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.AcceptGenerator")
    public <A> void accept(final VoidVisitor<A> v, final A arg) {
        v.visit(this, arg);
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public JavaToken getContent() {
        return new JavaToken(0, content);
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public JmlDoc setContent(final @NonNull() String content) {
        assertNotNull(content);
        if (content == this.content) {
            return this;
        }
        notifyPropertyChange(ObservableProperty.CONTENT, this.content, content);
        this.content = content;
        return this;
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.CloneGenerator")
    public JmlDoc clone() {
        return (JmlDoc) accept(new CloneVisitor(), null);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.GetMetaModelGenerator")
    public JmlDocMetaModel getMetaModel() {
        return JavaParserMetaModel.jmlDocMetaModel;
    }

    /**
     * This constructor is used by the parser and is considered private.
     */
    @Generated("com.github.javaparser.generator.core.node.MainConstructorGenerator")
    public JmlDoc(TokenRange tokenRange, String content) {
        super(tokenRange);
        setContent(content);
        customInitialization();
    }

    public JmlDoc(TokenRange tokenRange, JavaToken content) {
        this(tokenRange, content.getText());
    }

    @com.github.javaparser.ast.key.IgnoreLexPrinting()
    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public @NonNull() String content() {
        return Objects.requireNonNull(content);
    }
}
