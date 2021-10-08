package ru.job4j.stream.exercise;


import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;
/**
 * https://job4j.ru/profile/topics/3/task_code/97/solution/new_task
 * Ваша задача прописать создание коллекции и добавление элемента.
 * Коллекцией будет LinkedList, для добавление нужно использовать метод add()
 * <p>
 * Каркас: ru.job4j.stream.CollectorClass
 */
public class CollectorClass {
    public static List<Integer> collect(List<Integer> list) {
        Supplier<List<Integer>> supplier = LinkedList::new;
        BiConsumer<List<Integer>, Integer> biConsumer = List::add;
        BinaryOperator<List<Integer>> operator = (left, right) -> {
            left.addAll(right);
            return left;
        };
        return list.stream().collect(Collector.of(supplier, biConsumer, operator));
    }
}
