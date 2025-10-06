package org.example.ButtonHandlers;

import org.example.*;
import org.example.gui.MainPanel.BottomPanel.CashFieldPanel;
import org.example.gui.MainPanel.BottomPanel.TextAreaPanel;

import javax.swing.*;
import java.awt.event.*;

public record ProductButtonHandler(Product product) implements ActionListener {
    public void actionPerformed(ActionEvent actionEvent) {
        BoughtItem boughtItem = new BoughtItem(product);
         if (alreadyContains(product)) {
            JOptionPane.showMessageDialog(null, "You've already chosen that product!");
            return;
         }
        while (true) {
            try {
                String input = JOptionPane.showInputDialog("Input quantity of product: ");
                if (input == null || input.trim().isEmpty()) {
                    break;
                } else if (Integer.parseInt(input) <= 0) {
                    JOptionPane.showMessageDialog(null, "Quantity must be greater than 0!");
                } else if (Integer.parseInt(input) > 10) {
                    JOptionPane.showMessageDialog(null, "Quantity must be lesser than 10!");
                } else {
                    boughtItem.setQuantity(Integer.parseInt(input));
                    Order.appendOrders(boughtItem);
                    double priceTimesQuantity = (boughtItem.getProduct().price() * boughtItem.getQuantity());
                    String messageAppend1 = String.format(
                            "%s x %d ----- Php%.2f\n", boughtItem.getProduct().name(), boughtItem.getQuantity(), priceTimesQuantity
                    );
                    TextAreaPanel.getOrderTextArea().append(messageAppend1);
                    CashFieldPanel.getTotalLabel().setText(String.format("Total: Php%.2f", Order.calculateTotal()));
                    break;
                }
            } catch (NumberFormatException e) { JOptionPane.showMessageDialog(null, "Please input a valid quantity!"); }
        }
    }
    private boolean alreadyContains(Product product) {
        for (BoughtItem boughtItem : Order.getOrders()) {
            if (boughtItem.getProduct() == product) {
                return true;
            }
        }
        return false;
    }
}