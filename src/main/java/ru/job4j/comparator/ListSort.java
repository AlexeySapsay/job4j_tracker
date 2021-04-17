package ru.job4j.comparator;

//https://job4j.ru/edu/task_code?topicId=30&taskCodeId=148&solutionId=new_task

import java.util.List;
import java.util.Comparator;

public class ListSort {
    public static List<String> sort(List<String> data) {
        data.sort(Comparator.nullsLast(Comparator.reverseOrder()));
        return data;
    }
}
