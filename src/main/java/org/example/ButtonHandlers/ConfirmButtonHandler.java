package org.example.ButtonHandlers;
import org.example.Order;
import org.example.gui.MainPanel.BottomPanel.ButtonPanel;
import org.example.gui.MainPanel.BottomPanel.CashFieldPanel;
import org.example.gui.MainPanel.MiddlePanel.ProductPanel;
import org.example.gui.MainPanel.BottomPanel.TextAreaPanel;

import javax.swing.*;
import java.awt.event.*;

import static org.example.gui.MainPanel.BottomPanel.CashFieldPanel.*;

public class ConfirmButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent actionEvent) {
        if (!TextAreaPanel.getOrderTextArea().getText().isEmpty() && !Order.getOrders().isEmpty()) {
            double change;
            try {
                change = Double.parseDouble(getCashTextField().getText()) - Order.calculateTotal();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Only input numbers!");
                return;
            }
            if (change < 0) {
                JOptionPane.showMessageDialog(null, "Insufficient cash!");
            } else if (!ButtonPanel.isCanClickConfirmButton()) {
                JOptionPane.showMessageDialog(null, "You have already confirmed the order!");
            }
                else {
                CashFieldPanel.getChangeLabel().setText(String.format("<html>Change:<br>Php%.2f</html>", change));
                for (JButton button : ProductPanel.getButtons()) {
                    button.setEnabled(false);
                }
                ButtonPanel.setCanClickNextCustomerButton(true);
                ButtonPanel.setCanClickConfirmButton(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "You haven't placed an order yet!");
        }
    }
}