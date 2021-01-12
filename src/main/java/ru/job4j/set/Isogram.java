package ru.job4j.set;

/**
 * Изограмма - это слово, которое не содержит повторяющихся букв, т.е. все буквы в таком слове уникальные.
 * <p>
 * Метод принимает на входе строку, которая является словом, все буквы написаны в нижнем регистре. Входная строка - не фраза, а одно слово, поэтому ее не нужно делить на слова.
 * <p>
 * Метод должен вернуть булево значение - если слово является изограммой - то метод вернет true, иначе - false.
 */

import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean checkString(String s) {
        Set<Character> charSet = new HashSet<Character>();

        for (int i = 0; i < s.length(); i++) {
            charSet.add(s.charAt(i));
        }

        return charSet.size() == s.length();
    }
}
