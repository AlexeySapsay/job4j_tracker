package ru.job4j.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*https:\\job4j.ru/edu/task_code?topicId=30&taskCodeId=152&solutionId=new_task*/

public class SortBySetUsingComparator {
    public static Set<String> sort(List<String> list) {
        Set<String> set = new TreeSet<String>(Comparator.reverseOrder());
        set.addAll(list);
        return set;
    }
}
