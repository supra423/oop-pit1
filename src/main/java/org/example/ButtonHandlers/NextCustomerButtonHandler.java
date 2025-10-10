package org.example.ButtonHandlers;

import org.example.*;
import org.example.gui.MainPanel.BottomPanel.*;
import org.example.gui.MainPanel.MiddlePanel.*;

import javax.swing.*;
import java.awt.event.*;

public class NextCustomerButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent actionEvent) {
        if (!TextAreaPanel.getOrderTextArea().getText().isEmpty() && ButtonPanel.isCanClickNextCustomerButton()) {
            for (int i = 0; i < Order.getOrders().toArray().length; i++) {
                for (int j = 0; j < SalesInventory.getBoughtItems().length; j++) {
                    if (Order.getOrders().get(i).getProduct().name().equals(SalesInventory.getBoughtItems()[j].getProduct().name())) {
                        SalesInventory.getBoughtItems()[j].addQuantity(Order.getOrders().get(i).getQuantity());
                        break;
                    }
                }
            }
            Order.resetOrders();
            CashFieldPanel.getTotalLabel().setText("Total: Php00.00");
            CashFieldPanel.getChangeLabel().setText("Change: Php00.00");
            CashFieldPanel.getCashTextField().setText("");
            TextAreaPanel.getOrderTextArea().setText("");
            for (JButton button : ProductPanel.getButtons()) { button.setEnabled(true); }
            ButtonPanel.setCanClickNextCustomerButton(false);
            ButtonPanel.setCanClickConfirmButton(true);
            SalesInventory.getBoughtItems();
        } else { JOptionPane.showMessageDialog(null, "Please complete current order!"); }
    }
}
