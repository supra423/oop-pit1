package org.example.gui.MainPanel.BottomPanel;

import org.example.ButtonHandlers.*;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {
    private static boolean canClickNextCustomerButton = false;
    private static boolean canClickConfirmButton = true;
    public ButtonPanel() {
        this.setLayout(new GridBagLayout());
        this.setBackground(Color.decode("#9EC3DD"));
        this.setPreferredSize(new Dimension(300, 400));
        JPanel panel1 = new JPanel(new GridBagLayout());
        panel1.setBackground(Color.decode("#9EC3DD"));

        GridBagConstraints gbc = new GridBagConstraints();
        JButton confirmButton = new JButton();
        JButton cancelButton = new JButton();
        ConfirmButtonHandler confirmButtonHandler = new ConfirmButtonHandler();
        CancelButtonHandler cancelButtonHandler = new CancelButtonHandler();
        confirmButton.setLayout(new GridBagLayout());
        cancelButton.setLayout(new GridBagLayout());
        confirmButton.addActionListener(confirmButtonHandler);
        cancelButton.addActionListener(cancelButtonHandler);
        confirmButton.setBackground(Color.decode("#0D9316"));
        cancelButton.setBackground(Color.decode("#DE3314"));
        confirmButton.setPreferredSize(new Dimension(220, 75));
        cancelButton.setPreferredSize(new Dimension(220, 75));

        JLabel confirmButtonLabel = new JLabel("CONFIRM");
        confirmButtonLabel.setForeground(Color.WHITE);
        JLabel cancelButtonLabel = new JLabel("CANCEL");
        cancelButtonLabel.setForeground(Color.WHITE);
        confirmButtonLabel.setFont(new Font("Arial", Font.BOLD, 20));
        cancelButtonLabel.setFont(new Font("Arial", Font.BOLD, 20));
        confirmButton.add(confirmButtonLabel);
        cancelButton.add(cancelButtonLabel);

        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        panel1.add(confirmButton, gbc);

        gbc.gridy = 1;
        panel1.add(cancelButton, gbc);

        JButton nextCustomerButton = new JButton();
        JButton salesInventoryButton = new JButton();
        NextCustomerButtonHandler nextCustomerButtonHandler = new NextCustomerButtonHandler();
        SalesInventoryButtonHandler salesInventoryButtonHandler = new SalesInventoryButtonHandler();
        nextCustomerButton.addActionListener(nextCustomerButtonHandler);
        salesInventoryButton.addActionListener(salesInventoryButtonHandler);
        nextCustomerButton.setBackground(Color.decode("#7E5303"));
        salesInventoryButton.setBackground(Color.decode("#5A0B88"));
        nextCustomerButton.setLayout(new GridBagLayout());
        salesInventoryButton.setLayout(new GridBagLayout());

        JLabel nextCustomerLabel1 = new JLabel("NEXT CUSTOMER");
        nextCustomerLabel1.setForeground(Color.WHITE);
        nextCustomerLabel1.setFont(new Font("Arial", Font.BOLD, 20));
        JLabel salesInventoryLabel1 = new JLabel("SALES");
        JLabel salesInventoryLabel2 = new JLabel("INVENTORY");
        salesInventoryLabel1.setForeground(Color.WHITE);
        salesInventoryLabel2.setForeground(Color.WHITE);
        salesInventoryLabel1.setFont(new Font("Arial", Font.BOLD, 20));
        salesInventoryLabel2.setFont(new Font("Arial", Font.BOLD, 20));

        gbc.gridy = 0;
        nextCustomerButton.add(nextCustomerLabel1, gbc);
        gbc.gridy = 1;
        nextCustomerButton.setPreferredSize(new Dimension(220, 75));
        salesInventoryButton.setPreferredSize(new Dimension(220, 75));

        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 0, 0);
        salesInventoryButton.add(salesInventoryLabel1, gbc);
        gbc.gridy = 1;
        salesInventoryButton.add(salesInventoryLabel2, gbc);
        gbc.gridy = 2;
        gbc.insets = new Insets(10, 10, 10, 10);
        panel1.add(nextCustomerButton, gbc);
        gbc.gridy = 3;
        panel1.add(salesInventoryButton, gbc);

        this.add(panel1);
    }
    public static void setCanClickNextCustomerButton(boolean val) {
        canClickNextCustomerButton = val;
    }
    public static boolean isCanClickNextCustomerButton() {
        return canClickNextCustomerButton;
    }

    public static void setCanClickConfirmButton(boolean val) {
        canClickConfirmButton = val;
    }
    public static boolean isCanClickConfirmButton() {
        return canClickConfirmButton;
    }
}