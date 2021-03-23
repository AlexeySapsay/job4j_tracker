package ru.job4j.map;
//https://job4j.ru/edu/task_code?topicId=29&taskCodeId=181&solutionId=new_task
/**
 * В данном задании необходимо реализовать словарь.
 * Метод принимает массив строк. Необходимо перебрать
 * массив и добавить строки в карту таким образом, чтобы
 * ключом был первый символ строки, а значением - список строк,
 * которые начинаются на первый символ строки.
 */
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
        public static void main(String[] args) {
        System.out.println(collectData(new String[]{"two", "three", "four", "five", "six", "seven"}));
    }
    // мое решение
//    public static Map<String, List<String>> collectData(String[] strings) {
//        Map<String, List<String>> rsl = new HashMap<>();
//        List<String> listEmpty = new ArrayList<String>();
//
//        for (String str : strings) {
//            rsl.putIfAbsent(String.valueOf(str.charAt(0)), listEmpty);
//        }
//
//        for (String strFromKeySet : rsl.keySet()) {
//            List<String> listBuffer = new ArrayList<String>();
//            for (String str : strings) {
//                if (strFromKeySet.equals(String.valueOf(str.charAt(0)))) {
//                    listBuffer.add(str);
//                }
//            }
//            rsl.computeIfPresent(strFromKeySet, (key, value) -> value = listBuffer);
//        }
//        return rsl;
//    }

    // решение парня из чата, красивое и элегантное, с лямбдами
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strings) {
            String f = String.valueOf(s.charAt(0));
            if (null != map.putIfAbsent(f, new ArrayList<>(Arrays.asList(s)))) {
                map.compute(f, (k, v) -> {
                    v.add(s);
                    return v;
                });
            }
        }
        return map;
    }
}
