package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {
        String[] str = {"String222", "Str0", "String100000000000"};
        /**
         * 1. Создайте компаратор для строк через лямбда.
         *  Строки должны сравниваться через метод compareTo.
         */

        Comparator<String> cmpText = (left, right) -> {
            System.out.println("Compare left:" + left.length() + " by compareTo: "
                    + "with right" + right.length());
            return left.compareTo(right);
        };
        Arrays.sort(str, cmpText);
        /** 2. Создайте компаратор для строк через лямбда.
         * Компаратор должен сортировать строки по убыванию длины.
         */
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare" + left + " string with right "
                    + right + " by descending");
            return right.length() - left.length();
        };
        Arrays.sort(str, cmpDescSize);
    }
}
