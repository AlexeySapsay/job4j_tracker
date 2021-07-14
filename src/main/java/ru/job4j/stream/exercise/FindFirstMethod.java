package ru.job4j.stream.exercise;

import java.util.List;
import java.util.Optional;

/**
 * Method return Optional is empty if stream is empty
 * and return Optional from the first element
 */

public class FindFirstMethod {
    public static Optional<Integer> first(List<Integer> list) {
        return list.stream().findFirst();
    }
}
