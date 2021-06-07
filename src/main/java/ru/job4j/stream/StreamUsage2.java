package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamUsage2 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        Random rn = new Random();
        for (int i = 0; i < 10; i++) {
            int randInt = rn.nextInt(30 + 10) - 20;
            integerList.add(randInt);
        }
        System.out.println(integerList);

        List<Integer> positiveList = integerList.stream()
                .filter(num -> num > 0)
                .collect(Collectors.toList());

        positiveList.forEach(System.out::println);
    }
}
