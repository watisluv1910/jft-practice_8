package org.app.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        int cost = 0;
        cost = book.getPrice() - (book.getPrice() > 50 ? 5 : 0);
        System.out.println("Book ISBN:: " + book.getIsbnNumber() + ", cost = " + cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + ", cost = " + cost);
        return cost;
    }
}
