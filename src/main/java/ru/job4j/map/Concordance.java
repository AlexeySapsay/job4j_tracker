package ru.job4j.map;
/**
 * https:\\job4j.ru/edu/task_code?topicId=29&taskCodeId=188&solutionId=new_task
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;
import java.util.Map;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> map = new HashMap<Character, List<Integer>>();
        Set<String> set = new LinkedHashSet<String>();
        /**
         *remove whitespace from string
         */
        String str = s.replaceAll(" ", "");
        /**
         *create a LinkedHashSet with unique elements
         */

        for (int i = 0; i < str.length(); i++) {
            set.add(String.valueOf(str.charAt(i)));
        }
        /**
         *counting char in the string and save the index to ArrayList
         */

        for (String strInd : set) {
            List<Integer> indexList = new ArrayList<Integer>();
            for (int i = 0; i < str.length(); i++) {
                if (strInd.equals(String.valueOf(str.charAt(i)))) {
                    indexList.add(i);
                }
            }
            map.put(strInd.charAt(0), indexList);
        }
        return map;
    }
}
