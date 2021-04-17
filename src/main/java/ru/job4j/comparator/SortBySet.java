package ru.job4j.comparator;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//https://job4j.ru/edu/task_code?topicId=30&taskCodeId=151&solutionId=new_task

public class SortBySet {
    public static Set<String> sort(List<String> list) {
        Set<String> sortTreeSet = new TreeSet<>(list);
        return sortTreeSet;
    }
}
