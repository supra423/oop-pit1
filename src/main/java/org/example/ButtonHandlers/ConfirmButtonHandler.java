package org.example.ButtonHandlers;

import org.example.Order;
import org.example.gui.MainPanel.BottomPanel.*;
import org.example.gui.MainPanel.MiddlePanel.ProductPanel;

import javax.swing.*;
import java.awt.event.*;

import static org.example.gui.MainPanel.BottomPanel.CashFieldPanel.*;

public class ConfirmButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent actionEvent) {
        if (!TextAreaPanel.getOrderTextArea().getText().isEmpty() && !Order.getOrders().isEmpty()) {
            try {
                double change = Double.parseDouble(getCashTextField().getText()) - Order.calculateTotal();

                // A little bug fix, bugs sometimes happen when dealing with floating point
                // precision numbers. When the user inputs the exact value, say the total
                // payment is 2099.97, the user may put the exact values 2099.97 and then the
                // system would prompt insufficient cash because binary floating point
                // numbers cant really represent the exact value, 2099.97 might actually be
                // 2099.9700000000000000001. What I did here is just round the actual change
                // to 2 decimal places.
                double roundedChange = Math.round(change * 100.0) / 100.0;
                if (roundedChange < 0) {
                    JOptionPane.showMessageDialog(null, "Insufficient cash!");
                } else if (!ButtonPanel.isCanClickConfirmButton()) {
                    JOptionPane.showMessageDialog(null, "You have already confirmed the order!");
                } else {
                    CashFieldPanel.getChangeLabel().setText(String.format("Change: Php%.2f", roundedChange));
                    for (JButton button : ProductPanel.getButtons()) {
                        button.setEnabled(false);
                    }
                    ButtonPanel.setCanClickNextCustomerButton(true);
                    ButtonPanel.setCanClickConfirmButton(false);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Only input numbers!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "You haven't placed an order yet!");
        }
    }
}