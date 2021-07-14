package ru.job4j.stream.exercise;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Method return the stream with power 2 numbers
 */

public class NumberMap {
    public static List<Integer> map(List<Integer> numbers) {
        return numbers.stream().map(n -> n * n).collect(Collectors.toList());
    }
}
