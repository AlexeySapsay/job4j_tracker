package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamTest1 {
    public static void main(String[] args) {
        int[] array = {1, 9, 4, 5, 67, 18};
        int[] array1 = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();

        Set<String> stringSet = new TreeSet<>();
        stringSet.add("Privet");
        stringSet.add("Kak dela?");
        stringSet.add("normalno");
        stringSet.add("Normalno, ne realnyo?");

        Set<Integer> strLenght = stringSet.stream()
                .map(String::length)
                .collect(Collectors.toSet());
        System.out.println(strLenght);

        List<Integer> listLenght = stringSet.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(listLenght);
    }
}
