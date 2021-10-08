package ru.job4j.stream.exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *https://job4j.ru/profile/topics/3/task_code/14/solution/new_task
 * подсказку к задаче взял с сайта стэковерфлов
 * https://stackoverflow.com/questions/41877611/integer-
 *  sequences-in-iterator-of-iterators-java
 */

public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        List<Integer> listInteger = new ArrayList<>();

        it.forEachRemaining(subIt ->
                subIt.forEachRemaining(listInteger::add));
        return listInteger;
    }
}
