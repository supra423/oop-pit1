package org.example.gui.MainPanel.BottomPanel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class TextAreaPanel extends JPanel {
    private static final JTextArea orderTextArea = new JTextArea();
    public TextAreaPanel() {
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(470, 370));
        this.setBackground(Color.decode("#9EC3DD"));
        this.setBorder(new EmptyBorder(10, 10, 10, 10));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        orderTextArea.setBackground(Color.decode("#E8F6FF"));
        orderTextArea.setFont(new Font("Arial", Font.BOLD, 18));
        orderTextArea.setForeground(Color.BLACK);
        orderTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(orderTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.add(scrollPane, gbc);
    }
    static public JTextArea getOrderTextArea() { return orderTextArea; }
}