package org.example.gui.SalesInventoryWindow;

import org.example.BoughtItem;
import org.example.SalesInventory;

import javax.swing.*;
import java.awt.*;

public class SalesInventoryTextArea extends JTextArea {
    public SalesInventoryTextArea() {
        this.setFont(new Font("Arial", Font.PLAIN, 20));
        this.setBackground(Color.decode("#E8F6FF"));
        this.setEditable(false);
        StringBuilder stringBuilder = new StringBuilder();
        double grandTotal = 0;
        for (BoughtItem boughtItem: SalesInventory.getBoughtItems()) {
            stringBuilder.append(String.format("Product: %s --- Price: Php%.2f Quantity: %d Subtotal: %.2f\n\n",
                    boughtItem.getProduct().name(),
                    boughtItem.getProduct().price(),
                    boughtItem.getQuantity(),
                    (boughtItem.getQuantity() * boughtItem.getProduct().price())));
            grandTotal += (boughtItem.getQuantity() * boughtItem.getProduct().price());
        }
        String grandTotalMessage = String.format("\n\nGrand Total: %.2f", grandTotal);
        String productsMessage = stringBuilder.toString();
        this.setText(productsMessage + grandTotalMessage);
    }
}
