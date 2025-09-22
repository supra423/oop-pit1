package org.example;

import org.example.gui.PaymentPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public record ProductButtonHandler(Product product) implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        BoughtItem boughtItem = new BoughtItem(product);
        boughtItem.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Input quantity of product: ")));
        Order.appendOrders(boughtItem);
        double priceTimesQuantity = (boughtItem.getProduct().getPrice() * boughtItem.getQuantity());
        String messageAppend1 = String.format(
                "%s x %d ----- %.2f\n", boughtItem.getProduct().getName(), boughtItem.getQuantity(), priceTimesQuantity
        );
        PaymentPanel.getOrderTextArea().append(messageAppend1);
    }
}