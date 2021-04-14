package ru.job4j.collection;
//https://job4j.ru/edu/task_code?topicId=5&taskCodeId=16&solutionId=new_task

import java.util.Map;
import java.util.HashMap;

/**
 * Задан большой текст. Из него вырезают слова и предложения.
 * Из них составляют новый текст.
 * Нужно проверить, что новый текст был получен из оригинального.
 */

public class Article {
    public static void main(String[] args) {
        /**
         * main for manual testing
         */

//        String origin = "Мама мыла раму и окно";
//        String line = "мыла окно";

//        String origin = "Мой дядя самых честных правил, "
//                + "Когда не в шутку занемог, "
//                + "Он уважать себя заставил "
//                + "И лучше выдумать не мог. "
//                + "Его пример другим наука; "
//                + "Но, боже мой, какая скука "
//                + "С больным сидеть и день и ночь, "
//                + "Не отходя ни шагу прочь! "
//                + "Какое низкое коварство "
//                + "Полуживого забавлять, "
//                + "Ему подушки поправлять, "
//                + "Печально подносить лекарство, "
//                + "Вздыхать и думать про себя: "
//                + "Когда же черт возьмет тебя!";
//        String line = "Мой дядя мог думать про тебя и день и ночь";

        //System.out.println(generatedBy(origin, line));
    }

    /**
     *
     * @param origin строка исходного текста
     * @param line строка текста получаенная из слов исходного тектса origin
     * @return - true - в случае если возможно составить line из слов origin
     *              false - если не возможно составить
     */
    public static boolean generateBy(String origin, String line) {
        /*
          Испульзую HashMap для хранения строк.
          в качестве ключа беру слово, а значение- количество повторений
          слова в исходной строке
         */
        Map<String, Integer> originMap = new HashMap<String, Integer>();
        Map<String, Integer> lineMap = new HashMap<String, Integer>();

        /*
        Разбиваю строки origin and line по прбелам на слова
        удаляю не буквенные символы
        заношу пары ключь- слово, значение- количество повторов слова  HashMap
         */
        for (String word : origin.replaceAll("[-+.^:,!]", "").
                toLowerCase().trim().split("\\s")) {
            originMap.computeIfPresent(word, (key, value) -> value += 1);
            originMap.putIfAbsent(word, 1);
        }

        for (String word : line.replaceAll("[-+.^:,!]", "").
                toLowerCase().trim().split("\\s")) {
            lineMap.computeIfPresent(word, (key, value) -> value += 1);
            lineMap.putIfAbsent(word, 1);

        }

        /*
        Проверяю, присутствет ли данное слово в originMap and lineMap
        перебираею слова по lineMap, т.к она обычно меньшего размера и удобнее
        для перебора.

        Возвращаем false если количество повторений слова
        в исходном тексте меньше чем количество повтоений этого слова
        в составной строке
         */
        for (String word : lineMap.keySet()) {
            if (originMap.containsKey(word) && lineMap.containsKey(word)) {
                if (originMap.get(word) - lineMap.get(word) >= 0) {
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
