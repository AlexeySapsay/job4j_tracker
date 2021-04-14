package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

//https://job4j.ru/edu/task_code?topicId=5&taskCodeId=20&solutionId=new_task

/**
 * Даны две строки. Нужно проверить, что вторая
 * строка получилась методом перестановок символов в первой строке.
 */

public class FreezeStr {
    public static boolean eq(String left, String right) {
        /*
          Испульзую HashMap для хранения букв.
          в качестве ключа беру слово, а значение- количество повторений
          буквы в исходной строке
         */
        Map<Character, Integer> leftMap = new HashMap<Character, Integer>();
        Map<Character, Integer> rightMap = new HashMap<Character, Integer>();

        /*
        Разбиваю строки left and right по буквам
        заношу пары ключь- буква, значение- количество повторов буквы в  HashMap
         */
        for (Character character : left.toCharArray()) {
            leftMap.computeIfPresent(character, (key, value) -> value += 1);
            leftMap.putIfAbsent(character, 1);
        }

        for (Character character : right.toCharArray()) {
            rightMap.computeIfPresent(character, (key, value) -> value += 1);
            rightMap.putIfAbsent(character, 1);
        }

        /*
        Проверяю, присутствет ли данное буква в leftMap and rightMap
        перебираею слова по rightMap, т.к она обычно меньшего размера и удобнее
        для перебора.

        Возвращаем false если количество повторений буквы
        в исходном тексте меньше чем количество повтоений этого буквы
        в составном слове
         */
        for (Character character : rightMap.keySet()) {
            if (leftMap.containsKey(character) && rightMap.containsKey(character)) {
                if (leftMap.get(character) - rightMap.get(character) >= 0) {
                    continue;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
