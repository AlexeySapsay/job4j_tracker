package ru.job4j.lambda.exercise;

import java.util.Arrays;
import java.util.Optional;

public class OptionalIfPresent {
    public static void ifPresent(int[] data) {
        Optional<Integer> optional1 = OptionalIfPresent.max(data);
        optional1.ifPresent(integer -> System.out.println("Max: " + integer));
    }

    private static Optional<Integer> max(int[] data) {
        if (data.length == 0) {
            return Optional.empty();
        }
        Arrays.sort(data);
        int max = data[data.length - 1];
        return Optional.of(max);
    }
}
