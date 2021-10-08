package ru.job4j.map;

import java.util.*;

/**
 * https://job4j.ru/edu/task_code?topicId=29&taskCodeId=161&solutionId=new_task
 */

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        SortedMap<Character, Integer> treeMap = new TreeMap<>();
        /**1. convert the string to lover case
         *1.1 remove white space from charArray;
         */
        String strLWS = str.toLowerCase().replaceAll("\\s", "");
        /**
         *3. save characters like a key and count - volume in the tree map
         */
        for (int ch = 0; ch < strLWS.length(); ch++) {
            /**
             *  3.1 putIfAbsent();
             *  вставит пару ключ(символ) значение(1) -
             *  если такого символа в отображении еще нет.
             */
            treeMap.putIfAbsent(strLWS.charAt(ch), 0);
            /**
             *3.2 computeIfPresent();
             * обновит значение частотности употребления символа
             */
            treeMap.computeIfPresent(strLWS.charAt(ch), (key, value) -> value + 1);
        }

        /**
         *4. return most popular character
          */
        Integer max = 0;
        Character keyMax;
        char rsl = ' ';

        /**
         * 4.1 looking for max value and return
         * equivalent max key
         */
        for (Character charKey : treeMap.keySet()) {
            if (treeMap.get(charKey) > max) {
                max = treeMap.get(charKey);
                keyMax = charKey;
                rsl = keyMax;
            }
        }
        return rsl;
    }
}
