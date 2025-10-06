package org.example.gui.MainPanel.BottomPanel;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class TextAreaPanel extends JPanel {
    private static final JTextArea orderTextArea = new JTextArea();
    public TextAreaPanel() {
        this.setLayout(new GridLayout());
        this.setPreferredSize(new Dimension(470, 370));

        orderTextArea.setBackground(Color.decode("#E8F6FF"));
        orderTextArea.setFont(new Font("Arial", Font.BOLD, 18));
        orderTextArea.setForeground(Color.BLACK);
        orderTextArea.setBorder(new LineBorder(Color.decode("#98CEE0")));
        orderTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(orderTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.add(scrollPane);
    }
    static public JTextArea getOrderTextArea() { return orderTextArea; }
}