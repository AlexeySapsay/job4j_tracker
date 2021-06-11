package ru.job4j.stream.exercise;

import java.util.List;

public class MinMethod1 {
    public static Integer min(List<Integer> list) {
        return list.stream()
                .min((n1, n2) ->
                        Integer.compare(n2, n1))
                .get();
    }
}
