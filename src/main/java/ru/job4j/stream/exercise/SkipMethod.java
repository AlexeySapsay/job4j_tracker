package ru.job4j.stream.exercise;

import java.util.List;
import java.util.stream.Collectors;
/**
 * To skip a certain number of stream elements, you can use the skip () method
 * For example,
 * List.of (1, 2, 3, 4, 5) .stream (). Skip (2) // will stream from items 3, 4, 5
 * Your task is to take and get the elements of the list, except for the first
 * two
 */
public class SkipMethod {
    public static List<String> lastThree(List<String> strings) {
        return strings.stream()
                .skip(2)
                .collect(Collectors.toList());
    }
}
