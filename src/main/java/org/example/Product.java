package org.example;

public class Product {
    String name;
    double price;
    Product() {
        this.name = "Unknown Product";
        this.price = 1.0;
    }
    Product(String name, double Price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
}