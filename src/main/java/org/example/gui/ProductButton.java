package org.example.gui;

import org.example.ButtonHandler;
import org.example.Product;

import javax.swing.*;

public class ProductButton extends JButton {
    private final Product product;

    public ProductButton() {
        this.product = new Product();
        this.addActionListener(new ButtonHandler(product));
    }
    public ProductButton(Product product) {
        this.setText(product.getName());
        this.product = product;
        this.addActionListener(new ButtonHandler(product));
    }
}