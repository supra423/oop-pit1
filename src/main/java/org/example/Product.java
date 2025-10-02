package org.example;

import javax.swing.*;

public record Product(String name, double price, ImageIcon icon) {
    public Product(String name, double price) { this(name, price, null); }

    public Product() { this("Unknown Product", 1.0); }
}