package ru.job4j.stream.exercise;

import java.util.List;

public class NoneMatchMethod {
    public static boolean check(List<String> list) {
        return list.stream()
                .noneMatch(s -> s.length() == 0);
    }
}
