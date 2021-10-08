package ru.job4j.lambda.exercise;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalOrlElse {
    public static Integer orElse(Optional<Integer> optional) {
        Integer value = -1;
        if (optional.isPresent()) {
            value = optional.get();
        }
        return value;
    }
}