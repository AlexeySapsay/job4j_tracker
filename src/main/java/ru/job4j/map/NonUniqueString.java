package ru.job4j.map;
//https://job4j.ru/edu/task_code?topicId=29&taskCodeId=180&solutionId=new_task

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();

        for (String str : strings) {
            boolean flag = false;
            //looking for non unique strings in array strings
            int firstIndexOf = Arrays.toString(strings).indexOf(str);
            int lastIndexOf = Arrays.toString(strings).lastIndexOf(str);

            if (firstIndexOf != lastIndexOf) {
                flag = true;
            }
            map.put(str, flag);
        }
        System.out.println(map);
        return map;
    }
}
