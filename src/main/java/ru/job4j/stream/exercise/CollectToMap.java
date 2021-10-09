package ru.job4j.stream.exercise;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*https://job4j.ru/profile/topics/3/task_code/65/solution/41570*/

public class CollectToMap {
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toMap(k -> k, v -> v * v));
    }
}
