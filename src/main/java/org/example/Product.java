package org.example;

public class Product {
    private final String name;
    private final double price;

    public Product() {
        this.name = "Unknown Product";
        this.price = 1.0;
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}