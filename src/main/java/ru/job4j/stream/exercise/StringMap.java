package ru.job4j.stream.exercise;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Method return strings with + .java
 */
public class StringMap {
    public static List<String> map(List<String> names) {
        return names.stream()
                .map(s -> s + ".java")
                .collect(Collectors.toList());
    }
}
