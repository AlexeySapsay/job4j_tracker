package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfAbsent1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "first");
        System.out.println(map.get(1));

        map.computeIfAbsent(1, key -> "first" + " " + key);
        System.out.println(map.get(1));

        map.computeIfAbsent(2, key -> "second" + " " + key);
        System.out.println(map.get(2));

        map.computeIfAbsent(3, key -> "third" + " " + key);
        System.out.println(map.get(3));

        map.computeIfAbsent(4, key -> "four" + " " + key);
        System.out.println(map.get(4));
    }
}
