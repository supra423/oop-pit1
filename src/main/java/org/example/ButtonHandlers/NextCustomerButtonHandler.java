package org.example.ButtonHandlers;

import org.example.BoughtItem;
import org.example.Order;
import org.example.SalesInventory;
import org.example.gui.MainPanel.BottomPanel.ButtonPanel;
import org.example.gui.MainPanel.BottomPanel.CashFieldPanel;
import org.example.gui.MainPanel.MiddlePanel.*;

import javax.swing.*;
import java.awt.event.*;

public class NextCustomerButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent actionEvent) {
        if (!TextAreaPanel.getOrderTextArea().getText().isEmpty() && ButtonPanel.canClickNextCustomerButton) {
            for (BoughtItem boughtItem : Order.getOrders()) {
                SalesInventory.appendSalesInventory(boughtItem);
            }
            Order.resetOrders();
            CashFieldPanel.getTotalLabel().setText("<html>Total:<br>Php00.00</html>");
            CashFieldPanel.getChangeLabel().setText("<html>Change:<br>Php00.00</html>");
            CashFieldPanel.getCashTextField().setText("");
            TextAreaPanel.getOrderTextArea().setText("");
            for (JButton button : ProductPanel.getButtons()) {
                button.setEnabled(true);
            }
            ButtonPanel.canClickNextCustomerButton = false;
        } else {
            JOptionPane.showMessageDialog(null, "Please complete current order!");
        }
    }
}
