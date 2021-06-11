package ru.job4j.lambda;

import java.util.function.Function;

/**
 * Ниже приведен код. Вам нужно дописать лямбда выражение,
 * которое возводит переданное число в квадрат (для 2 = 4, для 3 = 9 и тд)
 */
public class FunctionPow {
    public static double calculate(double x) {
        Function<Double, Double> powCal = f -> Math.pow(x, 2);
        return calculate(powCal, 2);
    }

    private static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
