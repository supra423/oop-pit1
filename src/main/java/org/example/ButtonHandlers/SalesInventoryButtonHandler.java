package org.example.ButtonHandlers;
import org.example.*;

import javax.swing.JOptionPane;
import java.awt.event.*;
import java.util.ArrayList;

public class SalesInventoryButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent actionEvent) {
        ArrayList<BoughtItem> salesInventory = SalesInventory.getSalesInventory();
        StringBuilder stringBuilder = new StringBuilder("SALES INVENTORY\n\n");
        double grandTotal = 0;
        for (BoughtItem boughtItem : salesInventory) {
            stringBuilder.append(String.format("<html><font size='6'>Product: %s --- Price: Php%.2f Quantity: %d Subtotal: %.2f\n</html>",
                    boughtItem.getProduct().name(),
                    boughtItem.getProduct().price(),
                    boughtItem.getQuantity(),
                    (boughtItem.getQuantity() * boughtItem.getProduct().price())));
            grandTotal += (boughtItem.getQuantity() * boughtItem.getProduct().price());
        }
        String grandTotalMessage = String.format("<html><font size='6'>\n\nGrand Total: %.2f</html>", grandTotal);
        String productsMessage = stringBuilder.toString();
        JOptionPane.showMessageDialog(null, "<html><font size='3'>Sales Inventory<br></html>" + productsMessage + grandTotalMessage);
    }
}
