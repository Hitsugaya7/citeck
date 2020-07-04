package com.task_three;

import org.junit.Assert;
import org.junit.Test;

public class TaskThreeTest {

    @Test
    public void TestRevertSmallBitPositiveOne() {
        int param = 10;
        Integer actual = TaskThree.revertSmallBit(param);

        String binaryExpectedValue = getExpectedValue(param);
        String binaryActualValue = Integer.toBinaryString(actual);

        Assert.assertEquals(binaryExpectedValue, binaryActualValue);
        Assert.assertEquals(Integer.valueOf(11), actual);
    }

    @Test
    public void TestRevertSmallBitPositiveTwo() {
        int param = 11;
        Integer actual = TaskThree.revertSmallBit(param);

        String binaryExpectedValue = getExpectedValue(param);
        String binaryActualValue = Integer.toBinaryString(actual);

        Assert.assertEquals(binaryExpectedValue, binaryActualValue);
        Assert.assertEquals(Integer.valueOf(11), actual);
    }

    @Test
    public void TestRevertSmallBitPositiveThree() {
        int param = -10;
        Integer actual = TaskThree.revertSmallBit(param);

        String binaryExpectedValue = getExpectedValue(param);
        String binaryActualValue = Integer.toBinaryString(actual);

        Assert.assertEquals(binaryExpectedValue, binaryActualValue);
        Assert.assertEquals(Integer.valueOf(-9), actual);
    }

    @Test
    public void TestRevertSmallBitPositiveFour() {
        int param = -158;
        Integer actual = TaskThree.revertSmallBit(param);

        String binaryExpectedValue = getExpectedValue(param);
        String binaryActualValue = Integer.toBinaryString(actual);

        Assert.assertEquals(binaryExpectedValue, binaryActualValue);
        Assert.assertEquals(Integer.valueOf(-157), actual);
    }

    @Test
    public void TestRevertSmallBitPositiveFive() {
        int param = 0;
        Integer actual = TaskThree.revertSmallBit(param);

        String binaryExpectedValue = getExpectedValue(param);
        String binaryActualValue = Integer.toBinaryString(actual);

        Assert.assertEquals(binaryExpectedValue, binaryActualValue);
        Assert.assertEquals(Integer.valueOf(1), actual);
    }

    @Test(expected = NullPointerException.class)
    public void TestRevertSmallBitNegative() {
        Integer actual = TaskThree.revertSmallBit(null);
    }

    private String getExpectedValue(Integer param) {
        String binaryStringParam = Integer.toBinaryString(param);
        return binaryStringParam.substring(0, binaryStringParam.length() - 1) + "1";
    }

}