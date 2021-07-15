package ru.job4j.stream.exercise;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The sorted () method can also accept a Comparator.
 *
 * Your task is to sort the lines in descending order.
 * Need to use Comparator.reverseOrder () to get the comparator
 *
 */
public class SortedWithComparator {
    public static List<String> sorted(List<String> strings) {
        return strings.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
