package ru.job4j.lambda;

import java.util.function.Predicate;

/**
 * Ваша задача создать предикат Predicate, который проверяет, что строка пустая,
 * для этого нужно использовать метод isEmpty() в классе String
 */

public class MRPredicate {
    public static Predicate<String> predicate() {
        Predicate<String> predicate = String::isEmpty;
        return predicate;
    }
}
