package ru.job4j.stream.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * In order to get a stream of unique elements, we can use the distinct () method.
 * If we use a stream of primitives, then the comparison of elements goes through
 * ==, if we stream objects, then through the equals method.
 */

public class DistinctForPrimitive {
    public static List<Integer> collect(int[] data) {
        return Arrays.stream(data)
                .distinct()
                .boxed()
                .collect(Collectors.toList());
    }
}

