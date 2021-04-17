package ru.job4j.comparator;
//https://job4j.ru/edu/task_code?topicId=30&taskCodeId=146&solutionId=new_task

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortWithObject {
    public static String[] sort(String[] data) {
        Arrays.sort(data, Comparator.reverseOrder());
        return data;
    }
}
