package ru.job4j.lambda;

import java.util.function.Function;

/**
 * Ниже приведен код. Вам нужно дописать лямбда
 * выражение, которое извлекает корень квадратный из числа
 */
public class FunctionSqrt {
    public static double calculate(double x) {
        Function<Double, Double> sqrtCalc = a -> Math.pow(x, 0.5);
        return calculate(sqrtCalc, x);
    }

    private static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
