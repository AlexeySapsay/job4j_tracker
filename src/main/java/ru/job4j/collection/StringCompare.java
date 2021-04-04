package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int finish = Math.min(left.length(), right.length());
        char[] arrLeft = left.toCharArray();
        char[] arrRight = right.toCharArray();

        for (int i = 0; i < finish; i++) {
            if (arrLeft[i] != arrRight[i]) {
                return arrLeft[i] - arrRight[i];
            }
        }
        return left.length() - right.length();
    }
}
