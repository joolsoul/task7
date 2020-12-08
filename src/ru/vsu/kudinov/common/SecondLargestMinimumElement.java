package ru.vsu.kudinov.common;

public class SecondLargestMinimumElement
{
    public static int findSecondLargestMinimumElement(int [] arr)
    {
        for (int i = arr.length - 1; i >= 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int variable = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = variable;
                }
            }
        }
        return arr[1];
    }

    public static boolean checkArray(int [] arr)
    {
        int first = arr[0];
        boolean checkResult = true;
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] == first)
            {
                checkResult = false;
                break;
            }
        }
        return checkResult;
    }
}
