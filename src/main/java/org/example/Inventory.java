package org.example;

public class Inventory {

    static Product product1 = new Product("Item1", 100.0);
    static Product product2 = new Product("Item2", 200.0);
    static Product product3 = new Product("Item3", 300.0);
    static Product product4 = new Product("Item4", 400.0);
    static Product product5 = new Product("Item5", 500.0);
    static Product product6 = new Product("Item6", 600.0);
    static Product product7 = new Product("Item7", 700.0);
    static Product product8 = new Product("Item8", 800.0);
    static Product product9 = new Product("Item9", 900.0);

    static public Product[] inventory = {
            product1, product2, product3,
            product4, product5, product6,
            product7, product8, product9
    };
}
