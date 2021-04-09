package ru.job4j.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * Вам необходимо реализовать метод, который принимает строку,
 * которое является одним словом, без знаков препинания цифр и
 * пробелов. Метод должен вернуть новую строку, в которой все
 * символы исходной строки будут расставлены в алфавитном порядке.
 * Для разделения строки на подстроки используйте метод split(),
 * добавьте все элементы в коллекцию List<String>, отсортируйте
 * в порядке возрастания - используйте метод sort, в который
 * передадите компаратор. Новую строку сформируйте с помощью
 * StringBuilder.
 */
public class Alphabet {
    public static String reformat(String s) {
        List<String> list = new ArrayList<>();
        String[] splitteredStr = new String[s.length()];

        splitteredStr = s.split("");

        for (int i = 0; i < s.length(); i++) {
            list.add(splitteredStr[i]);
        }
        Collections.sort(list);

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            str.append(list.get(i));
        }
        String string = str.toString();

        return string;
    }
}
