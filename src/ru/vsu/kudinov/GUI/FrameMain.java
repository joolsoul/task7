package ru.vsu.kudinov.GUI;

import javax.swing.*;
import java.awt.*;

public class FrameMain extends JFrame
{
    private JPanel mainPanel;
    private JTextField inputArrayField;
    private JButton applyButton;
    private JButton clearButton;
    private JTextField outputResultField;

    public FrameMain()
    {
        super("task 7");
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500, 500, 500, 150);
        this.setMinimumSize(new Dimension(500, 130));
        setVisible(true);

        applyButton.addActionListener(new Listener(inputArrayField, outputResultField));
        clearButton.addActionListener(new ClearFields(inputArrayField, outputResultField));
    }
}
