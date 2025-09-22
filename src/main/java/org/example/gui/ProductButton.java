package org.example.gui;

import org.example.ProductButtonHandler;
import org.example.Product;

import javax.swing.*;

public class ProductButton extends JButton {
    public ProductButton(Product product) {
        this.setText("<html><font size='16'>" + product.name() + "<br>" + product.price() + "</html>");
        this.addActionListener(new ProductButtonHandler(product));
    }
}