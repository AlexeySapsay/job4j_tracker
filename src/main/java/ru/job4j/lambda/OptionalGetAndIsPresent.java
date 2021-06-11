package ru.job4j.lambda;

import java.util.Optional;

public class OptionalGetAndIsPresent {
    public static int get(int[] data, int el) {
        Optional<Integer> optional2 = indexOf(data, el);
        if (optional2.isEmpty()) {
            return -1;
        }
        return optional2.get();
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        for (int i = 0; i < data.length; i++) {
            if (el == data[i]) {
                Optional<Integer> optional = Optional.of(i);
                return optional;
            }
        }
        Optional<Integer> optional = Optional.empty();
        return optional;
    }
}
