package org.example.ButtonHandlers;

import org.example.Order;
import org.example.gui.MainPanel.BottomPanel.CashFieldPanel;
import org.example.gui.MainPanel.MiddlePanel.ProductPanel;
import org.example.gui.MainPanel.BottomPanel.TextAreaPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    }
}
