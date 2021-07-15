package ru.job4j.stream.exercise;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Method return List Integer from List List Integer
 */

public class FlatMapForObject {
    public static List<Integer> flatMap(List<List<Integer>> lists) {
        return lists.stream()
                .flatMap(subList -> subList.stream())
                .collect(Collectors.toList());
    }
}
