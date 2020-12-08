package ru.vsu.kudinov.console;

import ru.vsu.kudinov.ArrayUtils;
import ru.vsu.kudinov.common.SecondLargestMinimumElement;

public class ConsoleMain {

    public static void main(String[] args)
    {

        int[] arr = ArrayUtils.readIntArrayFromConsole();

        if (SecondLargestMinimumElement.checkArray(arr))
        {
            int result = SecondLargestMinimumElement.findSecondLargestMinimumElement(arr);

            printResult(result);
        }
        else
        {
            System.out.print("No such element exists. All elements of the array are equal.");
        }

    }

    public static void printResult(int result)
    {

        System.out.print("Your result is " + result);
    }
}
