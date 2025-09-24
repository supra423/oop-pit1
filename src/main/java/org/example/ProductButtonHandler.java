package org.example;

import org.example.gui.MainPanel.MiddlePanel.TextAreaPanel;

import javax.swing.*;
import java.awt.event.*;

public record ProductButtonHandler(Product product) implements ActionListener {
    public void actionPerformed(ActionEvent actionEvent) {
        BoughtItem boughtItem = new BoughtItem(product);
        while (true) {
            try {
                String input = JOptionPane.showInputDialog("Input quantity of product: ");
                if (input == null || input.trim().isEmpty()) {
                    break;
                } else if (Integer.parseInt(input) <= 0) {
                    JOptionPane.showMessageDialog(null, "Quantity must be greater than 0!");
                } else {
                    boughtItem.setQuantity(Integer.parseInt(input));
                    Order.appendOrders(boughtItem);
                    double priceTimesQuantity = (boughtItem.getProduct().price() * boughtItem.getQuantity());
                    String messageAppend1 = String.format(
                            "%s x %d ----- Php%.2f\n", boughtItem.getProduct().name(), boughtItem.getQuantity(), priceTimesQuantity
                    );
                    TextAreaPanel.getOrderTextArea().append(messageAppend1);
                    break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please input a valid quantity!");
            }
        }
    }
}