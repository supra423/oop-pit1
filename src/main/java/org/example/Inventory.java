package org.example;

public class Inventory {

    final static private Product product1 = new Product("Product1", 100.0);
    final static private Product product2 = new Product("Product2", 200.0);
    final static private Product product3 = new Product("Product3", 300.0);
    final static private Product product4 = new Product("Product4", 400.0);
    final static private Product product5 = new Product("Product5", 500.0);
    final static private Product product6 = new Product("Product6", 600.0);
    final static private Product product7 = new Product("Product7", 700.0);
    final static private Product product8 = new Product("Product8", 800.0);
    final static private Product product9 = new Product("Product9", 900.0);

    static private Product[] inventory = {
            product1, product2, product3,
            product4, product5, product6,
            product7, product8, product9
    };

    public Product[] getInventory() {
        return inventory;
    }
}
