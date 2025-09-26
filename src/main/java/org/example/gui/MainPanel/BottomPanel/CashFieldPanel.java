package org.example.gui.MainPanel.BottomPanel;

import org.example.BoughtItem;
import org.example.Order;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CashFieldPanel extends JPanel {
    public static JLabel totalLabel = new JLabel("<html>Total:<br>Php00.00</html>");
    public static JLabel changeLabel = new JLabel("<html>Change:<br>Php00.00</html>");
    public CashFieldPanel() {
        this.setLayout(new GridLayout());
        this.setBackground(Color.decode("#9EC3DD"));
        JPanel panel1 = new JPanel(new GridBagLayout());
        panel1.setBackground(Color.decode("#9EC3DD"));

        JPanel totalPanel = new JPanel(new GridBagLayout());
        totalLabel.setFont(new Font("Arial", Font.BOLD, 32));
        totalPanel.setBackground(Color.decode("#E8F6FF"));
        totalPanel.setPreferredSize(new Dimension(300, 180));
        totalPanel.add(totalLabel);
        panel1.add(totalPanel);

        JPanel panel2 = new JPanel(new GridBagLayout());
        panel2.setBackground(Color.decode("#9EC3DD"));

        GridBagConstraints gbc = new GridBagConstraints();

        JPanel cashPanel = new JPanel(new GridBagLayout());
        JLabel cashLabel = new JLabel("Cash:");
        JLabel phpLabel = new JLabel("Php");

        JTextField cashTextField = new JTextField(6);
        cashLabel.setFont(new Font("Arial", Font.BOLD, 32));
        cashTextField.setFont(new Font("Arial", Font.BOLD, 32));
        phpLabel.setFont(new Font("Arial", Font.BOLD, 32));
        cashPanel.setBackground(Color.decode("#E8F6FF"));
        cashPanel.setPreferredSize(new Dimension(300, 85));

        gbc.gridy = 0;
        cashPanel.add(cashLabel, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        cashPanel.add(phpLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        cashPanel.add(cashTextField, gbc);

        JPanel changePanel = new JPanel();
        changePanel.setBackground(Color.decode("#E8F6FF"));
        changePanel.setPreferredSize(new Dimension(300, 85));
        changeLabel.setFont(new Font("Arial", Font.BOLD, 32));
        changePanel.add(changeLabel);

        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridy = 0;
        panel2.add(cashPanel, gbc);
        gbc.gridy = 1;
        panel2.add(changePanel, gbc);

        this.add(panel1);
        this.add(panel2);
    }
}