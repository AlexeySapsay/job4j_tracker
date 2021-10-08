package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapTest1 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = List.of(1, 2, 3, 4).stream()
                .distinct().collect(
                        Collectors.toMap(
                                element -> element,
                                element -> element
                                /*element -> element * 10*/
                        ));
        System.out.println(map);
    }
}
