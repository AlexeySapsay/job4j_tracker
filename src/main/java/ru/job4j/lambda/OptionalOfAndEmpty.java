package ru.job4j.lambda;

import ru.job4j.function.ForEach;

import java.util.List;
import java.util.Optional;

public class OptionalOfAndEmpty {
    public static Optional<String> findValue(List<String> strings, String value) {
        for (String strings1 : strings) {
            if (strings1.equals(value)) {
                Optional<String> str1 = Optional.of(value);
                return str1;
            }
        }

        Optional<String> str2 = Optional.empty();
        return str2;
    }

    public static Optional<String> findValue1(List<String> strings, String value) {
        for (String strings2 : strings) {
            if (strings2.equals(value)) {
                Optional<String> str1 = Optional.of(value);
                return str1;
            }
        }
        Optional<String> str2 = Optional.empty();
        return str2;
    }

    public static Optional<String> findValue2(List<String> strings, String value) {
        for (String string3 : strings) {
            if (string3.equals(value)) {
                Optional<String> str1 = Optional.of(value);
                return str1;
            }
        }
        Optional<String> str2 = Optional.empty();
        return str2;
    }

    public static Optional<String> findValue3(List<String> strings, String value) {
        for (String string4 : strings) {
            if (string4.equals(value)) {
                Optional<String> str1 = Optional.of(value);
                return str1;
            }
        }
        Optional<String> str2 = Optional.empty();
        return str2;
    }

    public static Optional<String> findValue4(List<String> strings, String value) {
        for (String string4 : strings) {
            if (string4.equals(value)) {
                Optional<String> str1 = Optional.of(value);
                return str1;
            }
        }
        Optional<String> str2 = Optional.empty();
        return str2;
    }

    public static Optional<String> findValue5(List<String> strings, String value) {
        for (String string5 : strings) {
            if (string5.equals(value)) {
                Optional<String> str1 = Optional.of(value);
                return str1;
            }
        }
        Optional<String> str2 = Optional.empty();
        return str2;
    }
}
