package org.example.gui;

import org.example.ButtonHandler;
import org.example.Product;

import javax.swing.*;

public class PurchaseButton extends JButton {
    private Product product;


    public PurchaseButton() {
        this.product = new Product();
        this.addActionListener(new ButtonHandler());
    }
    public PurchaseButton(Product product) {
        this.setText(product.getName());
        this.product = product;
        this.addActionListener(new ButtonHandler());
    }
}