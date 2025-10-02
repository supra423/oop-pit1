package org.example.ButtonHandlers;

import org.example.Order;
import org.example.gui.MainPanel.BottomPanel.*;
import org.example.gui.MainPanel.MiddlePanel.ProductPanel;

import javax.swing.*;
import java.awt.event.*;

public class CancelButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent actionEvent) {
        Order.resetOrders();
        CashFieldPanel.getTotalLabel().setText("Total: Php00.00");
        CashFieldPanel.getChangeLabel().setText("Change: Php00.00");
        CashFieldPanel.getCashTextField().setText("");
        TextAreaPanel.getOrderTextArea().setText("");
        for (JButton button : ProductPanel.getButtons()) {
            button.setEnabled(true);
        }
        ButtonPanel.setCanClickConfirmButton(true);
    }
}
