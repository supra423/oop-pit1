package org.example.gui;

import org.example.ProductButtonHandler;
import org.example.Product;

import javax.swing.*;

public class ProductButton extends JButton {
    private final Product product;

    public ProductButton() {
        this.product = new Product();
        this.addActionListener(new ProductButtonHandler(product));
    }
    public ProductButton(Product product) {
        this.setText("<html><font size='16'>" + product.getName() + "<br>" + product.getPrice() + "</html>");
        this.product = product;
        this.addActionListener(new ProductButtonHandler(product));
    }
}