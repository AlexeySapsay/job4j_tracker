package ru.job4j.lambda;

import java.util.function.Predicate;

/**
 * https:\\job4j.ru/profile/topics/33/task_code/58/solution/new_task
 * Ниже приведен код. Вам нужно дописать лямбда
 * выражение, которое проверяет, что число четное
 */
public class PredicateCheckEven {
    public static boolean check(int num) {
        Predicate<Integer> a = (x) -> x % 2 == 0;
        return check(a, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
