package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        String[] str = {"String222", "Str0", "String100000000000"};
        //1. Создайте компаратор для строк через лямбда.
        // Строки должны сравниваться через метод compareTo.
        Comparator<String> cmpText = (left, right) -> left.compareTo(right);
        Arrays.sort(str, cmpText);
        System.out.println(Arrays.toString(str));

        //2. Создайте компаратор для строк через лямбда.
        // Компаратор должен сортировать строки по убыванию длины.
        Comparator<String> cmpDescSize = (left, right)
                -> right.length() - left.length();
        Arrays.sort(str, cmpDescSize);
        System.out.println(Arrays.toString(str));
    }
}
