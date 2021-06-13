package ru.job4j.lambda.exercise;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        for (String i : strings) {
            if (Objects.equals(i, value) && i != null) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}
