package org.app.visitor;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
