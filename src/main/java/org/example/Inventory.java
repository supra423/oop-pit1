package org.example;

public class Inventory {
    final static private Product product1 = new Product("Product1", 99.99);
    final static private Product product2 = new Product("Product2", 199.99);
    final static private Product product3 = new Product("Product3", 299.99);
    final static private Product product4 = new Product("Product4", 399.99);
    final static private Product product5 = new Product("Product5", 499.99);
    final static private Product product6 = new Product("Product6", 599.99);
    final static private Product product7 = new Product("Product7", 699.99);
    final static private Product product8 = new Product("Product8", 799.99);
    final static private Product product9 = new Product("Product9", 899.99);

    static private final Product[] inventory = {
            product1, product2, product3,
            product4, product5, product6,
            product7, product8, product9
    };

    public Product[] getInventory() {
        return inventory;
    }
}
