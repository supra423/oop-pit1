package org.example.gui.MainPanel.BottomPanel;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {
    public ButtonPanel() {
        this.setLayout(new GridLayout());
        JPanel panel1 = new JPanel(new GridBagLayout());
        JPanel panel2 = new JPanel(new GridBagLayout());

        JButton nextCustomerButton = new JButton();
        JButton salesInventoryButton = new JButton();
        nextCustomerButton.setLayout(new GridBagLayout());
        salesInventoryButton.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        JLabel nextCustomerLabel1 = new JLabel("NEXT");
        JLabel nextCustomerLabel2 = new JLabel("CUSTOMER");

        JLabel salesInventoryLabel1 = new JLabel("SALES");
        JLabel salesInventoryLabel2 = new JLabel("INVENTORY");


        salesInventoryLabel1.setFont(new Font("Arial", Font.BOLD, 20));
        salesInventoryLabel2.setFont(new Font("Arial", Font.BOLD, 20));

        nextCustomerLabel1.setFont(new Font("Arial", Font.BOLD, 20));
        nextCustomerLabel2.setFont(new Font("Arial", Font.BOLD, 20));

        gbc.gridy = 0;
        nextCustomerButton.add(nextCustomerLabel1, gbc);
        gbc.gridy = 1;
        nextCustomerButton.add(nextCustomerLabel2, gbc);
        nextCustomerButton.setPreferredSize(new Dimension(130, 170));

        gbc.gridy = 0;
        salesInventoryButton.add(salesInventoryLabel1, gbc);
        gbc.gridy = 1;
        salesInventoryButton.add(salesInventoryLabel2, gbc);
        salesInventoryButton.setPreferredSize(new Dimension(130, 170));

        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 11);
        panel1.add(nextCustomerButton, gbc);

        panel1.add(salesInventoryButton, gbc);

        JButton confirmButton = new JButton();
        JButton cancelButton = new JButton();
        confirmButton.setLayout(new GridBagLayout());
        cancelButton.setLayout(new GridBagLayout());

        JLabel confirmButtonLabel = new JLabel("CONFIRM");
        JLabel cancelButtonLabel = new JLabel("CANCEL");

        confirmButtonLabel.setFont(new Font("Arial", Font.BOLD, 40));
        cancelButtonLabel.setFont(new Font("Arial", Font.BOLD, 40));

        confirmButton.add(confirmButtonLabel);
        cancelButton.add(cancelButtonLabel);

        confirmButton.setPreferredSize(new Dimension(300, 80));
        cancelButton.setPreferredSize(new Dimension(300, 80));

        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        panel2.add(confirmButton, gbc);

        gbc.gridy = 1;
        panel2.add(cancelButton, gbc);

        this.add(panel1);
        this.add(panel2);
    }
}