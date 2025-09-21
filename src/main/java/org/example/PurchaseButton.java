package org.example;

import javax.swing.*;

public class PurchaseButton extends JButton {
    Product product;
    public PurchaseButton() {
        this.product = new Product();
    }
    public PurchaseButton(Product product) {
        this.setText(product.getName());
        this.product = product;
    }
}