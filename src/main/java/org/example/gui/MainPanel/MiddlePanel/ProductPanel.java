package org.example.gui.MainPanel.MiddlePanel;

import org.example.Inventory;
import org.example.Product;
import org.example.gui.MinorComponents.ProductButton;

import javax.swing.*;
import java.awt.*;

public class ProductPanel extends JPanel {
    private static final int NUMBER_OF_BUTTONS = 9;
    private static final Inventory inventory = new Inventory();
    public ProductPanel() {
        this.setLayout(new GridLayout(3, 3));
        this.setBackground(Color.decode("#333333"));
        this.setPreferredSize(new Dimension(900, 700));

        for (int i = 0; i < NUMBER_OF_BUTTONS; i++) {
            this.add(addButton(inventory.getInventory()[i]));
        }
    }

    ProductButton addButton(Product product) {
        ProductButton button = new ProductButton(product);
        button.setPreferredSize(new Dimension(100, 100));
        button.setBackground(Color.decode("#777777"));
        return button;
    }
}
