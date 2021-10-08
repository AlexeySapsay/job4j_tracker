package ru.job4j.comparator;
/*https://job4j.ru/edu/task_code?topicId=30&taskCodeId=153&solutionId=32945*/

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {
    public static Map<Integer, String> sort(Map<Integer, String> map) {
        Map<Integer, String> mapSortedReverseOrd = new TreeMap(Comparator.reverseOrder());
        mapSortedReverseOrd.putAll(map);
        return mapSortedReverseOrd;
    }
}
