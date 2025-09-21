package org.example;

import org.example.gui.PaymentPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public record ProductButtonHandler(Product product) implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String messageAppend1 = String.format("Product Name: %s -- Cost: Php%.2f\n", product.getName(), product.getPrice());
        PaymentPanel.getOrderTextArea().append(messageAppend1);
    }
}