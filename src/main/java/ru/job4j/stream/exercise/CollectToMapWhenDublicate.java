package ru.job4j.stream.exercise;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//https://job4j.ru/profile/topics/3/task_code/66/solution/new_task

/**
 * Метод собирает map из стрима с повторяющимися значениями
 */
public class CollectToMapWhenDublicate {
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data.collect(
                Collectors.toMap(
                        k -> k, v -> v * v, (prev, curr) -> prev));
    }
}
