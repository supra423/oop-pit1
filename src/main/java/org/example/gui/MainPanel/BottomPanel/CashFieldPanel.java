package org.example.gui.MainPanel.BottomPanel;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class CashFieldPanel extends JPanel {
    private static final JLabel totalLabel = new JLabel("Total: Php00.00");
    private static final JLabel changeLabel = new JLabel("Change: Php00.00");
    private static final JTextField cashTextField = new JTextField(14);
    public CashFieldPanel() {
        this.setLayout(new GridBagLayout());
        this.setBackground(Color.decode("#9EC3DD"));
        this.setPreferredSize(new Dimension(500, 350));

        JPanel totalPanel = new JPanel(new GridBagLayout());
        totalLabel.setFont(new Font("Arial", Font.BOLD, 30));
        totalPanel.setBackground(Color.decode("#E8F6FF"));
        totalPanel.setPreferredSize(new Dimension(480, 160));
        totalPanel.setBorder(new BevelBorder(BevelBorder.RAISED));
        JPanel innerTotalPanel = new JPanel(new GridBagLayout());
        innerTotalPanel.setPreferredSize(new Dimension(460, 130));
        innerTotalPanel.setBackground(Color.WHITE);
        innerTotalPanel.setBorder(new LineBorder(Color.decode("#98CEE0")));
        innerTotalPanel.add(totalLabel);

        GridBagConstraints gbc = new GridBagConstraints();

        JPanel cashPanel = new JPanel(new GridBagLayout());
        JLabel cashLabel = new JLabel("Cash: Php");

        cashLabel.setFont(new Font("Arial", Font.BOLD, 24));
        cashLabel.setBorder(new EmptyBorder(0, 10, 0, 10));
        cashTextField.setFont(new Font("Arial", Font.BOLD, 24));
        cashPanel.setBackground(Color.WHITE);
        cashPanel.setPreferredSize(new Dimension(460, 60));
        cashPanel.setBorder(new LineBorder(Color.decode("#98CEE0")));

        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        cashPanel.add(cashLabel, gbc);
        cashPanel.add(cashTextField, gbc);

        JPanel changePanel = new JPanel();
        changePanel.setBackground(Color.WHITE);
        changePanel.setPreferredSize(new Dimension(460, 60));
        changeLabel.setFont(new Font("Arial", Font.BOLD, 30));
        changePanel.setBorder(new LineBorder(Color.decode("#98CEE0")));
        changePanel.add(changeLabel);

        JPanel cashAndChangePanel = new JPanel(new GridBagLayout()); // group both change and cash panels
        cashAndChangePanel.setPreferredSize(new Dimension(480, 160));
        cashAndChangePanel.setBackground(Color.decode("#E8F6FF"));
        cashAndChangePanel.setBorder(new BevelBorder(BevelBorder.RAISED));


        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        totalPanel.add(innerTotalPanel, gbc);
        cashAndChangePanel.add(cashPanel, gbc);
        gbc.gridy = 1;
        cashAndChangePanel.add(changePanel, gbc);

        gbc.insets = new Insets(10, 10, 5, 10);
        gbc.gridy = 0;
        this.add(totalPanel, gbc);
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 10, 10, 10);
        this.add(cashAndChangePanel, gbc);
    }
    public static JLabel getTotalLabel() { return totalLabel; }
    public static JLabel getChangeLabel() { return changeLabel; }
    public static JTextField getCashTextField() { return cashTextField; }
}