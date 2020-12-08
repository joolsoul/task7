package ru.vsu.kudinov.tests;


import org.junit.Assert;
import org.junit.Test;
import ru.vsu.kudinov.common.SecondLargestMinimumElement;

public class TestSecondLargestMinimumElement
{
    @Test
    public void testGetSecondLargestMinimumElement1()
    {
        SecondLargestMinimumElement SecondLargestMinimumElement = new SecondLargestMinimumElement();
        int array1 = SecondLargestMinimumElement.findSecondLargestMinimumElement(new int[]{66, 21, 98, 12, 45, 11});
        int result = 12;

        Assert.assertEquals(array1, result);
    }

    @Test
    public void testGetSecondLargestMinimumElement2() {
        SecondLargestMinimumElement SecondLargestMinimumElement = new SecondLargestMinimumElement();
        int array1 = SecondLargestMinimumElement.findSecondLargestMinimumElement(new int[]{23, 87, 18, 2, 66, 91});
        int result = 18;

        Assert.assertEquals(array1, result);

    }
    @Test
    public void testGetSecondLargestMinimumElement3() {
        SecondLargestMinimumElement SecondLargestMinimumElement = new SecondLargestMinimumElement();
        int array1 = SecondLargestMinimumElement.findSecondLargestMinimumElement(new int[]{91, 26, 52, 77, 19, 80});
        int result = 26;

        Assert.assertEquals(array1, result);

    }
    @Test
    public void testGetSecondLargestMinimumElement4() {
        SecondLargestMinimumElement SecondLargestMinimumElement = new SecondLargestMinimumElement();
        int array1 = SecondLargestMinimumElement.findSecondLargestMinimumElement(new int[]{1, 3, -2, 11, 7, 4, 2, 7, 12});
        int result = 1;

        Assert.assertEquals(array1, result);

    }
    @Test
    public void testGetSecondLargestMinimumElement5() {
        SecondLargestMinimumElement SecondLargestMinimumElement = new SecondLargestMinimumElement();
        int array1 = SecondLargestMinimumElement.findSecondLargestMinimumElement(new int[]{-12, 25, 1000, 15, 87, 45});
        int result = 15;

        Assert.assertEquals(array1, result);

    }
    @Test
    public void testGetSecondLargestMinimumElement6() {
        SecondLargestMinimumElement SecondLargestMinimumElement = new SecondLargestMinimumElement();
        int array1 = SecondLargestMinimumElement.findSecondLargestMinimumElement(new int[]{1721, 2674, 1231, 2987, 1886, 2231, 1923, 2213, 1303});
        int result = 1303;

        Assert.assertEquals(array1, result);

    }
    @Test
    public void testGetSecondLargestMinimumElement7() {
        SecondLargestMinimumElement SecondLargestMinimumElement = new SecondLargestMinimumElement();
        int array1 = SecondLargestMinimumElement.findSecondLargestMinimumElement(new int[]{10, 11, 12, 9, 1, 2, 5, 7, 8, 10, 11, 12, 3, 4, 34});
        int result = 2;

        Assert.assertEquals(array1, result);

    }
    @Test
    public void testGetSecondLargestMinimumElement8() {
        SecondLargestMinimumElement SecondLargestMinimumElement = new SecondLargestMinimumElement();
        int array1 = SecondLargestMinimumElement.findSecondLargestMinimumElement(new int[]{-6, -4, -3, -2, -5, -1, -7});
        int result = -6;

        Assert.assertEquals(array1, result);

    }
    @Test
    public void testGetSecondLargestMinimumElement9() {
        SecondLargestMinimumElement SecondLargestMinimumElement = new SecondLargestMinimumElement();
        int array1 = SecondLargestMinimumElement.findSecondLargestMinimumElement(new int[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5});
        int result = -4;

        Assert.assertEquals(array1, result);

    }
    @Test
    public void testGetSecondLargestMinimumElement10() {
        SecondLargestMinimumElement SecondLargestMinimumElement = new SecondLargestMinimumElement();
        int array1 = SecondLargestMinimumElement.findSecondLargestMinimumElement(new int[]{55, 21, 654, 33, 987, 22});
        int result = 22;

        Assert.assertEquals(array1, result);

    }
}