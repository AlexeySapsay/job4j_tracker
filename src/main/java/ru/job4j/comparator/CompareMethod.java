package ru.job4j.comparator;
//https://job4j.ru/edu/task_code?topicId=30&taskCodeId=143&solutionId=new_task

public class CompareMethod {
    public static int ascendingCompare(int first, int second) {
        return Integer.compare(first, second);
    }

    public static int descendingCompare(int first, int second) {
        return Integer.compare(second, first);
    }
}
