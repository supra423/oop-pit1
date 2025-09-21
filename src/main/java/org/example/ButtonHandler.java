package org.example;

import org.example.gui.PaymentPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {
    private final Product product;

    public ButtonHandler(Product product) {
        this.product = product;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PaymentPanel.getOrderTextArea().append(product.getName() + "\n");
    }
}
