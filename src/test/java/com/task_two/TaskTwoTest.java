package com.task_two;

import lombok.SneakyThrows;
import org.junit.Assert;
import org.junit.Test;

public class TaskTwoTest {

    @Test
    @SneakyThrows
    public void TestCheckExpressionPositiveOne() {
        Boolean actual = TaskTwo.checkExpression("([]([()]))");
        Assert.assertEquals(Boolean.TRUE, actual);
    }

    @Test
    @SneakyThrows
    public void TestCheckExpressionNegativeOne() {
        Boolean actual = TaskTwo.checkExpression(")(");
        Assert.assertEquals(Boolean.FALSE, actual);
    }

    @Test
    @SneakyThrows
    public void TestCheckExpressionNegativeTwo() {
        Boolean actual = TaskTwo.checkExpression("[(])");
        Assert.assertEquals(Boolean.FALSE, actual);
    }

    @Test
    @SneakyThrows
    public void TestCheckExpressionPositiveTwo() {
        Boolean actual = TaskTwo.checkExpression("[()]([])");
        Assert.assertEquals(Boolean.TRUE, actual);
    }

    @Test
    @SneakyThrows
    public void TestCheckExpressionPositiveThree() {
        Boolean actual = TaskTwo.checkExpression("([][[]()])");
        Assert.assertEquals(Boolean.TRUE, actual);
    }

    @Test
    @SneakyThrows
    public void TestCheckExpressionNegativeThree() {
        Boolean actual = TaskTwo.checkExpression("([][]()])");
        Assert.assertEquals(Boolean.FALSE, actual);
    }

    @SneakyThrows
    @Test(expected = Exception.class)
    public void TestCheckExpressionWithEmptyParamThrowsException() {
        Boolean actual = TaskTwo.checkExpression("");
    }

    @SneakyThrows
    @Test(expected = Exception.class)
    public void TestCheckExpressionWithNullParamThrowsException() {
        Boolean actual = TaskTwo.checkExpression(null);
    }
}