package ru.job4j.set;

import java.util.*;

/**
 * Панграмма - короткий текст, который использует все буквы алфавита, по возможности не повторяя их.
 *
 * Метод принимает строку(на английском языке). Необходимо реализовать его так, чтобы метод определил является ли входящая строка панграммой. Строчные и прописные буквы являются одинаковыми символами, пробелы необходимо игнорировать.
 *
 * Напомню, что в английском алфавите 26 букв.
 *
 */


public class Pangram {
    public static boolean checkString(String s) {
        s = s.toLowerCase();
        String[] strArr = s.replaceAll("\\s", "").split("");
        Character[] charArray = new Character[strArr.length];

        for (int index = 0; index < strArr.length; index++) {
            String buffer = "";
            buffer = strArr[index];
            charArray[index] = buffer.charAt(0);
        }

        Set<Character> chaSet = new HashSet<Character>(Arrays.asList(charArray));
        if (chaSet.size() == 26) {
            return true;
        } else {
            return false;
        }
    }
}
