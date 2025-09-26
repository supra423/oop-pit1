package org.example.gui.MinorComponents;

import org.example.ProductButtonHandler;
import org.example.Product;

import javax.swing.*;
import java.awt.*;

public class ProductButton extends JButton {
    public ProductButton(Product product) {
        this.setLayout(new GridBagLayout());
        this.addActionListener(new ProductButtonHandler(product));
    }
}