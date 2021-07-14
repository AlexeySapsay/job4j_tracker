package ru.job4j.stream.exercise;

import java.util.stream.Stream;

//https://job4j.ru/profile/topics/3/task_code/69/solution/new_task

/**
 * Method count counting numbers of elements in the stream
 */

public class CountMethod {
    public static long count(Stream<Integer> data) {
        return data.count();
    }
}
