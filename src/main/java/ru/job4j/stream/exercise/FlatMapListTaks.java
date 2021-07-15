package ru.job4j.stream.exercise;

import java.util.List;

public class FlatMapListTaks {
    public static void main(String[] args) {
        List<List<Integer>> lists = List.of(List.of(1, 2), List.of(3, 4));
        lists.stream()
                .flatMap(subList -> subList.stream())
                .forEach(el -> System.out.println(el));
    }
}
