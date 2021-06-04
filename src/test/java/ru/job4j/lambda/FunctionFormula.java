package ru.job4j.lambda;

import java.util.function.Function;

/**
 * Ниже приведен код. Вам нужно дописать лямбда выражение,
 * которое будет подставлять переданное число в формулу
 *
 * num * num + 2 * num + 1
 */
public class FunctionFormula {
    public static double calculate(double x) {
        Function<Double, Double> formResult = a -> a * a + 2 * a + 1;
        return calculate(formResult, x);
    }

    private static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
