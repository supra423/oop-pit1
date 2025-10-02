package org.example.ButtonHandlers;

import org.example.*;
import org.example.gui.MainPanel.BottomPanel.*;
import org.example.gui.MainPanel.MiddlePanel.*;

import javax.swing.*;
import java.awt.event.*;

public class NextCustomerButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent actionEvent) {
        if (!TextAreaPanel.getOrderTextArea().getText().isEmpty() && ButtonPanel.isCanClickNextCustomerButton()) {
            for (BoughtItem boughtItem : Order.getOrders()) { SalesInventory.appendSalesInventory(boughtItem); }
            Order.resetOrders();
            CashFieldPanel.getTotalLabel().setText("Total: Php00.00");
            CashFieldPanel.getChangeLabel().setText("Change: Php00.00");
            CashFieldPanel.getCashTextField().setText("");
            TextAreaPanel.getOrderTextArea().setText("");
            for (JButton button : ProductPanel.getButtons()) { button.setEnabled(true); }
            ButtonPanel.setCanClickNextCustomerButton(false);
            ButtonPanel.setCanClickConfirmButton(true);
        } else { JOptionPane.showMessageDialog(null, "Please complete current order!"); }
    }
}
