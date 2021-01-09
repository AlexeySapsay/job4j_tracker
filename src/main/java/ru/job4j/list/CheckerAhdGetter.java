package ru.job4j.list;

import java.util.List;

public class CheckerAhdGetter {
    public static String getElement(List<String> list) {
        if (list.size() == 0) {
            return "";
        } else {
            return list.get(0);
        }
    }
}
