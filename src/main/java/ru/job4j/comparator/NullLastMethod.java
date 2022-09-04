package ru.job4j.comparator;
/*https:\\job4j.ru/edu/task_code?topicId=30&taskCodeId=142&solutionId=new_task*/

import java.util.Comparator;

public class NullLastMethod {
    public static Comparator<String> nullLast() {
        return Comparator.nullsLast(Comparator.naturalOrder());
    }
}
