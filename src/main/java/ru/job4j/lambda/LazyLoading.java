package ru.job4j.lambda;

import java.util.Comparator;
import java.util.Arrays;

public class LazyLoading {
    public static void main(String[] args) {
        //String[] names = {"Alex"};
        String[] names = {"Alex", "Kostia", "Jenia"};

        Comparator<String> lengthComp = (left, right) -> {
            System.out.println("execute comparator");
            return left.length() - right.length();
        };
        Arrays.sort(names, lengthComp);
    }
}
