package ru.job4j.stream.exercise;

import java.util.List;
import java.util.stream.Collectors;

/**
 *In order to get a sorted stream, you can use the sorted () method.
 * Note that the implementation of this method without input parameters
 * uses the implemented compareTo () method of the Comparable interface.
 * Therefore, if you are sorting objects of a specific class, you need to
 * either pass a Comparator or implement Comparable
 *
 * For example,
 *
 * List.of (3, 2, 1) .stream (). Sorted ()
 *
 * Your task is to get a list of sorted strings
 *
 */
public class SortedMethod {
    public static List<String> sorted(List<String> strings) {
        return strings.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
