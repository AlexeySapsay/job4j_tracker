package ru.job4j.collection;
/**
 * https:\\job4j.ru/edu/task?action=task&taskId=0873958f758d0d5301758d8a573e2e4b&number=402116
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
