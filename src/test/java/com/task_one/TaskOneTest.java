package com.task_one;

import com.task_one.dto.CustomStruct;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskOneTest {

    @Test
    public void TestCountOfNumberOfEntriesOfListPositive() {
        List<CustomStruct> expectedList = expectedListPositive();
        List<CustomStruct> actualList = TaskOne.countOfNumberOfEntries(Arrays.asList(8, 8, 3, 5, 6, 3, 1, 1, 3));
        Assert.assertEquals(Boolean.TRUE, actualList.equals(expectedList));
    }

    @Test
    public void TestCountOfNumberOfEntriesOfArrayPositive() {
        List<CustomStruct> expectedList = expectedListPositive();
        List<CustomStruct> actualList = TaskOne.countOfNumberOfEntries(new Integer[]{8, 8, 3, 5, 6, 3, 1, 1, 3});
        Assert.assertEquals(Boolean.TRUE, actualList.equals(expectedList));
    }

    @Test
    public void TestCountOfNumberOfEntriesOfEmptyListPositive() {
        List<CustomStruct> actualList = TaskOne.countOfNumberOfEntries(new ArrayList<>());
        Assert.assertEquals(Boolean.TRUE, actualList.isEmpty());
    }

    private List<CustomStruct> expectedListPositive() {
        return Arrays.asList(
                new CustomStruct(5, 1),
                new CustomStruct(6, 1),
                new CustomStruct(1, 2),
                new CustomStruct(8, 2),
                new CustomStruct(3, 3));
    }
}