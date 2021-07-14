package ru.job4j.stream.exercise;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Этот метод собирает строки в текст и добавляет Prefix and Suffix
 * В joining  в качестве разделителей принимается
 * lineSeparator, Prefix, Suffix
 */

public class JoiningMethod {
    public static String join(List<String> strings) {
        return strings.stream()
                .collect(Collectors.joining(System.lineSeparator(),
                        "Prefix", "Suffix"));
    }
}
