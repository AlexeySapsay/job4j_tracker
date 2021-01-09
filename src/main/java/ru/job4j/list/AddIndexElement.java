package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class AddIndexElement {
    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>(list);
        //checking element in collection
        if (check.contains(str)) {
            return false;
        } else {
            list.add(index, str);
            return true;
        }
    }
}
