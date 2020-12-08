package ru.vsu.kudinov.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearFields implements ActionListener
{
    JTextField inputArrayField;
    JTextField outputResultField;

    public ClearFields(JTextField inputArrayField, JTextField outputResultField)
    {
        this.inputArrayField = inputArrayField;
        this.outputResultField = outputResultField;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        inputArrayField.setText(null);
        outputResultField.setText(null);
    }
}
