package ru.job4j.stream.exercise;

import java.util.List;
import java.util.stream.Collectors;

/**
 * If the condition is cumbersome, then you can place several calls
 * to filter in a row. Your task is to filter the list of strings
 * according to the following criteria.
 * The line must start with "A" and end with ".java"
 */

public class FilterString {
    public static List<String> filter(List<String> data) {
        return data.stream()
                .filter(s -> s.startsWith("A"))
                .filter(s -> s.endsWith("java"))
                .collect(Collectors.toList());
    }
}
