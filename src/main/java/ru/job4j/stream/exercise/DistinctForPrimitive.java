package ru.job4j.stream.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * In order to get a stream of unique elements, we can use the distinct () method.
 * If we use a stream of primitives, then the comparison of elements goes through
 * ==, if we stream objects, then through the equals method.
 *
 * For example,
 *
 * Arrays.stream (new int [] {1, 2, 1}). Distinct () // only 1, 2 will remain in
 * the stream
 *
 * Your task is to collect the unique numbers of the array into a list
 */

public class DistinctForPrimitive {
    public static List<Integer> collect(int[] data) {
        return Arrays.stream(data)
                .distinct()
                .boxed()
                .collect(Collectors.toList());
    }
}

