package ru.job4j.comparator;
//https://job4j.ru/edu/task_code?topicId=30&taskCodeId=137&solutionId=new_task

import java.util.Comparator;

public class NullFirstMethod {
    public static Comparator<String> nullFirst() {
        return Comparator.nullsFirst(Comparator.naturalOrder());
    }
}
