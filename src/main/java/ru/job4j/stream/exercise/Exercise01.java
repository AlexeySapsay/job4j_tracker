package ru.job4j.stream.exercise;

/**
 * https:\\job4j.ru/profile/topics/3/task_code/97/solution/new_task
 * 0.1. Понятие редукции. Произвольный Collector для сборки в коллекцию
 */

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class Exercise01 {
    public static void main(String[] args) {
        Supplier<Deque<Integer>> supplier = LinkedList::new;
        BiConsumer<Deque<Integer>, Integer> biConsumer = Deque::addFirst;
        BinaryOperator<Deque<Integer>> operator = (left, right)
                -> {
            right.forEach(left::addFirst);
            return left;
        };
        Deque<Integer> result = List.of(1, 2, 3).stream()
                .collect(Collector.of(
                        supplier,
                        biConsumer,
                        operator));
        result.forEach(System.out::println);
    }
}
