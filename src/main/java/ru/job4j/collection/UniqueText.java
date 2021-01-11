package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");

        /* for-each origin -> new HashSet. */
        HashSet<String> check = new HashSet<>();
        for (String str : origin) {
            check.add(str);
        }

        /* for-each text -> hashSet.contains */
        for (String el : text) {
            rsl = check.contains(el);
            if (!rsl) {
                return false;
            }
        }
        return rsl;
    }
}
