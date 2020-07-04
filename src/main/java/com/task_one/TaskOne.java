package com.task_one;

import com.task_one.dto.CustomStruct;

import java.util.*;
import java.util.stream.Collectors;

public class TaskOne {

    public static List<CustomStruct> countOfNumberOfEntries(List<Integer> list) {
        return getCustomStructList(list);
    }

    public static List<CustomStruct> countOfNumberOfEntries(Integer[] list) {

        return getCustomStructList(Arrays.asList(list));
    }

    private static List<CustomStruct> getCustomStructList(List<Integer> list) {
        if (list == null || list.isEmpty())
            return new ArrayList<>();
        Map<Integer, Integer> countOfNumberOfEntriesMap = new HashMap<>();
        for (Integer item : list) {
            if (!countOfNumberOfEntriesMap.containsKey(item)) {
                countOfNumberOfEntriesMap.put(item, 1);
            } else {
                countOfNumberOfEntriesMap.put(item, countOfNumberOfEntriesMap.get(item) + 1);
            }
        }
        return countOfNumberOfEntriesMap.entrySet().stream()
                .map(item -> new CustomStruct(item.getKey(), item.getValue()))
                .sorted(Comparator.comparing(CustomStruct::getCountOfEntries))
                .collect(Collectors.toList());
    }
}
