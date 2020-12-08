package ru.vsu.kudinov.GUI;

import ru.vsu.kudinov.ArrayUtils;
import ru.vsu.kudinov.common.SecondLargestMinimumElement;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener
{
    JTextField inputArrayField;
    JTextField outputResultField;

    public Listener(JTextField inputArrayField, JTextField outputResultField)
    {
        this.inputArrayField = inputArrayField;
        this.outputResultField = outputResultField;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String stringArray = inputArrayField.getText();
        int[] array = ArrayUtils.toIntArray(stringArray);
        int result = SecondLargestMinimumElement.findSecondLargestMinimumElement(array);
        this.outputResultField.setText(Integer.toString(result));

    }
}
