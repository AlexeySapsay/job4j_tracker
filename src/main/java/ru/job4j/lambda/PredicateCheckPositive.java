package ru.job4j.lambda;

import java.util.function.Predicate;

/**
 * Ниже приведен код. Вам нужно дописать лямбда выражение,
 * которое проверяет, что число положительное
 */
public class PredicateCheckPositive {
    public static boolean check(int num) {
        //return check(s -> s.compareTo(num), num);
        return num > 0;
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
