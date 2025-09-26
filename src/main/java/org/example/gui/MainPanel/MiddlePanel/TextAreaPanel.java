package org.example.gui.MainPanel.MiddlePanel;

import javax.swing.*;
import java.awt.*;

public class TextAreaPanel extends JPanel {
    private static final JTextArea orderTextArea = new JTextArea(36, 29);
    public TextAreaPanel() {
        this.setLayout(new GridLayout());
        this.setBackground(Color.decode("#888888"));
        this.setPreferredSize(new Dimension(400, 700));

        orderTextArea.setBackground(Color.decode("#5A81A1"));
        orderTextArea.setFont(new Font("Arial", Font.BOLD, 18));
        orderTextArea.setForeground(Color.WHITE);

        JScrollPane scrollPane = new JScrollPane(orderTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.add(scrollPane);
    }
    static public JTextArea getOrderTextArea() {
        return orderTextArea;
    }
}