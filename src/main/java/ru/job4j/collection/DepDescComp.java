package ru.job4j.collection;

import java.util.Comparator;
/**
 * https:\\job4j.ru/profile/exercise/32/task-view/235
 * Отсортировать департаменты
 *
 * @author AlexSapsay (sapsayalexey@gmail.com)
 * @version 1.0
 * @since 13.10.2021
 */
public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] left = o1.split("/");
        String[] right = o2.split("/");
        int rsl = right[0].compareTo(left[0]);
        return rsl == 0 ? o1.compareTo(o2) : rsl;
    }
}
