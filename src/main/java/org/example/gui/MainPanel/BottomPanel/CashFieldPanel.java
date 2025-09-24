package org.example.gui.MainPanel.BottomPanel;

import org.example.BoughtItem;
import org.example.Order;
import org.example.gui.SuperPanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CashFieldPanel extends SuperPanel {
    public static JLabel totalLabel = new JLabel("<html><font size='10'>Total:<br>Php00.00</html>");
    public CashFieldPanel() {
        this.setLayout(new GridLayout());
        JPanel panel1 = new JPanel(new GridBagLayout());

        JPanel totalPanel = new JPanel(new GridBagLayout());
        totalPanel.setBackground(Color.decode("#aaaaaa"));
        totalPanel.setPreferredSize(new Dimension(300, 180));
        totalPanel.add(totalLabel);
        panel1.add(totalPanel);

        JPanel panel2 = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        JPanel cashPanel = new JPanel(new GridBagLayout());
        cashPanel.setBackground(Color.decode("#aaaaaa"));
        cashPanel.setPreferredSize(new Dimension(300, 85));


        JPanel changePanel = new JPanel();
        changePanel.setBackground(Color.decode("#aaaaaa"));
        changePanel.setPreferredSize(new Dimension(300, 85));

        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridy = 0;
        panel2.add(cashPanel, gbc);
        gbc.gridy = 1;
        panel2.add(changePanel, gbc);

        this.add(panel1);
        this.add(panel2);
    }
}