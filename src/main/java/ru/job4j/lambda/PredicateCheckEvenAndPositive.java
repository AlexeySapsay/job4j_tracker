package ru.job4j.lambda;

import java.util.function.Predicate;

/**
 * Ниже приведен код. Вам нужно дописать лямбда выражение,
 * которое проверяет, что число четное и положительное
 */
public class PredicateCheckEvenAndPositive {
    public static boolean check(int num) {
        Predicate<Integer> a = (z) -> (z > 0) && (z % 2 == 0);
        return check(a, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
