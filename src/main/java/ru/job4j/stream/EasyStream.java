package ru.job4j.stream;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * *EasyStream работает только с типом Integer.
 * * //https://job4j.ru/TrackStudio/staticframeset.html#401629
 * *В нем есть четыре метода
 * <p>
 * of-получает исходные данные.
 * <p>
 * map-преобразует число в другое число.
 * <p>
 * filter-фильтрует поток элементов.
 * <p>
 * collect-собирает все элементы из source по заданным условиям map и filter.
 ***/

public class EasyStream {
    public static EasyStream of(List<Integer> source) {
        throw new UnsupportedOperationException();
    }

    public EasyStream map(Function<Integer, Integer> fun) {
        throw new UnsupportedOperationException();
    }

    public EasyStream filter(Predicate<Integer> fun) {
        throw new UnsupportedOperationException();
    }

    public List<Integer> collect() {
        throw new UnsupportedOperationException();
    }
}
