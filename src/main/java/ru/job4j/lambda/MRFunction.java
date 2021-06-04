package ru.job4j.lambda;

import java.util.function.Function;

/**
 * Ваша задача создать Function через ссылку на метод.
 * В качестве функции нужно использовать Math.sqrt()
 */

public class MRFunction {
    public static Function<Double, Double> apply() {
        Function<Double, Double> function = Math::sqrt;
        return function;
    }
}
