package ru.job4j.collection;
/*
*https://job4j.ru/edu/task_code?topicId=5&taskCodeId=16&solutionId=new_task
* */

import java.util.Arrays;
import java.util.HashSet;

/**
 * Задан большой текст. Из него вырезают слова и предложения.
 * Из них составляют новый текст.
 * Нужно проверить, что новый текст был получен из оригинального.
 */

public class Article {
    public static void main(String[] args) {
        /*String origin = "Мама мыла раму и окно";*/
        String line = "мыла окно";

        String origin = "Мой дядя самых честных правил, "
                + "Когда не в шутку занемог, "
                + "Он уважать себя заставил "
                + "И лучше выдумать не мог. "
                + "Его пример другим наука; "
                + "Но, боже мой, какая скука "
                + "С больным сидеть и день и ночь, "
                + "Не отходя ни шагу прочь! "
                + "Какое низкое коварство "
                + "Полуживого забавлять, "
                + "Ему подушки поправлять, "
                + "Печально подносить лекарство, "
                + "Вздыхать и думать про себя: "
                + "Когда же черт возьмет тебя!";
        /* String line = "Мой дядя мог думать про тебя и день и ночь";*/
        /*System.out.println(generatedBy(origin, line));*/
    }

    /**
     * @param origin строка исходного текста
     * @param line   строка текста получаенная из слов исходного тектса origin
     * @return - true - в случае если возможно составить line из слов origin
     * false - если не возможно составить
     */
    public static boolean generateBy(String origin, String line) {
        /*
          Испульзую HashSet для хранения строк.
          в качестве ключа беру слово, а значение- количество повторений
          слова в исходной строке
         */
        HashSet<String> setLeft = new HashSet<String>();
        HashSet<String> setRight = new HashSet<String>();

        /*
        Разбиваю строки origin and line по прбелам на слова
        удаляю не буквенные символы
        заношу слова в HashSet
         */
        setLeft.addAll(Arrays.asList(origin.replaceAll("[-+.^:,!]", "").
                toLowerCase().trim().split("\\s")));

        setRight.addAll(Arrays.asList(line.replaceAll("[-+.^:,!]", "").
                toLowerCase().trim().split("\\s")));
        /*возвращаю true- если setRight содержится в setLeft*/
        return setLeft.containsAll(setRight);
    }
}
