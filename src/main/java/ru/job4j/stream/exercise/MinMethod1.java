package ru.job4j.stream.exercise;

import java.util.Comparator;
import java.util.List;

public class MinMethod1 {
    public static Integer min(List<Integer> list) {
        return list.stream()
                .min(Comparator.comparingInt(n -> n))
                .get();
    }
}
