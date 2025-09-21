package org.example;

public class Product {
    private String name;
    private double price;

    public Product() {
        this.name = "Unknown Product";
        this.price = 1.0;
    }
    public Product(String name, double Price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
}