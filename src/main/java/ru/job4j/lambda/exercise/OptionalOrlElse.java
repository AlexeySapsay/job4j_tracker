package ru.job4j.lambda.exercise;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalOrlElse {
    public static Integer orElse(Optional<Integer> optional) {
        // do refactor
        Integer value = -1;
        if (optional.isPresent()) {
            value = optional.get();
        }
        return value;

        //Supplier<Integer> supplier = () -> (Integer) (int) (1 + 11 * Math.random());
        //Integer result = Optional.of(1).orElseGet(supplier);
        //return Optional.of(optional.get()).orElse(-1);
    }
}