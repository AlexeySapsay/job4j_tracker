package ru.job4j.stream.exercise;

import java.util.List;
import java.util.stream.Collectors;

/**
 * To take a certain number of the first elements of the stream,
 * you can use the limit () method
 * For example,
 * List.of (1, 2, 3, 4, 5) .stream (). Limit (2) // will stream from items 1, 2
 * Your task is to take the first 3 elements from the list
 */
public class LimitMethod {
    public static List<String> firsThree(List<String> strings) {
        return strings.stream()
                .limit(3)
                .collect(Collectors.toList());
    }
}
