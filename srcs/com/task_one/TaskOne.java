package com.task_one;

import java.util.*;
import java.util.stream.Collectors;

public class TaskOne {

    public static void main(String[] args) {
        List<CustomStruct> customStructs = TaskOne.countOfNumberOfEntries(Arrays.asList(8, 8, 8, 3, 3, 3, 4, 5, 5, 5, 5, 2, 2, 7, 6, 6, 1, 5, 4, 1, 4, 7));
        System.out.println();
    }


    public static List<CustomStruct> countOfNumberOfEntries(List<Integer> list) {
        Map<Integer, Integer> countOfNumberOfEntriesMap = new HashMap<>();
        for (Integer item : list) {
            if (!countOfNumberOfEntriesMap.containsKey(item)) {
                countOfNumberOfEntriesMap.put(item, 1);
            } else {
                countOfNumberOfEntriesMap.put(item, countOfNumberOfEntriesMap.get(item) + 1);
            }
        }
        return countOfNumberOfEntriesMap.entrySet().stream()
                .map(item -> new CustomStruct(item.getKey(), item.getValue())).sorted(Comparator.comparing(CustomStruct::getCountOfEntries)).collect(Collectors.toList());
    }
}
