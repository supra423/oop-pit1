package org.example;

public record Product(String name, double price) {
    public Product() {
        this("Unknown Product", 1.0);
    }
}