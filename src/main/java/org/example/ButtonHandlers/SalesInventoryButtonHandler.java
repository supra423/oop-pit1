package org.example.ButtonHandlers;
import org.example.BoughtItem;
import org.example.SalesInventory;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SalesInventoryButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent actionEvent) {
        ArrayList<BoughtItem> salesInventory = SalesInventory.getSalesInventory();
        StringBuilder stringBuilder = new StringBuilder("SALES INVENTORY\n\n");
        double grandTotal = 0;
        for (BoughtItem boughtItem : salesInventory) {
            stringBuilder.append(String.format("Product: %s --- Price: Php%.2f Quantity: %d Subtotal: %.2f\n",
                    boughtItem.getProduct().name(),
                    boughtItem.getProduct().price(),
                    boughtItem.getQuantity(),
                    (boughtItem.getQuantity() * boughtItem.getProduct().price())));
            grandTotal += (boughtItem.getQuantity() * boughtItem.getProduct().price());
        }
        String message = stringBuilder.toString();
        JOptionPane.showMessageDialog(null, message + "\n\nGrand Total: " + grandTotal);
    }
}
