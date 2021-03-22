package ru.job4j.map;
//https://job4j.ru/edu/task_code?topicId=29&taskCodeId=181&solutionId=new_task


/**
 * В данном задании необходимо реализовать словарь.
 * Метод принимает массив строк. Необходимо перебрать
 * массив и добавить строки в карту таким образом, чтобы
 * ключом был первый символ строки, а значением - список строк,
 * которые начинаются на первый символ строки.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    public static void main(String[] args) {
        System.out.println(collectData(new String[]{"two", "three", "four", "five", "six", "seven"}));
    }

    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        List<String> listEmpty = new ArrayList<String>();
        //List<String> listBuffer = new ArrayList<String>();
        //System.out.println(list);
//        list.add("a");
//        list.add("b");
//        list.add("c");

        // created a map and put the first character, converted to string = key,
        // value = null
        for (String str : strings) {
            //rsl.putIfAbsent(str.charAt(0), List < String > inputList = new ArrayList<String>());
            //String strBuffer = toString()str.charAt(0);
            rsl.putIfAbsent(String.valueOf(str.charAt(0)), listEmpty);
        }

//        for (String str : strings) {
//            List<String> listBuffer = new ArrayList<String>(List.of());
//            //rsl.computeIfPresent(String.valueOf(str.charAt(0)), (key, value) -> value = list);
//            //rsl.computeIfPresent(String.valueOf(str.charAt(0)), (key, value) -> value = List.of("1", "2", "3"));
//
////            if((rsl.keySet().equals(String.valueOf(str.charAt(0))))){
////                listEmpty.add(str);
////            }
//
//            if(rsl.containsKey(String.valueOf(str.charAt(0)))){
//                //List<String> listBuffer = new ArrayList<String>();
//                listBuffer.add(str);
//            }
//
//            rsl.computeIfPresent(String.valueOf(str.charAt(0)), (key, value) -> value = listBuffer);
//
//            //rsl.computeIfPresent(String.valueOf(str.charAt(0)), (key, value) -> value = list.add(str));
//            System.out.println(rsl);
//        }

        for (String strFromKeySet : rsl.keySet()) {
            List<String> listBuffer = new ArrayList<String>();
            for (String str : strings) {
                if (strFromKeySet.equals(String.valueOf(str.charAt(0)))) {
                    //System.out.println("somthing work");
                    listBuffer.add(str);
                    //System.out.println(str);
                    //System.out.println(listBuffer);
                }
            }
            rsl.computeIfPresent(strFromKeySet, (key, value) -> value = listBuffer);
        }


//        rsl.put("a", list);
//        Map<String, List<String>> expected = Map.of(
//                "s", List.of("six", "seven"),
//                "t", List.of("two", "three"),
//                "f", List.of("four", "five")
//        );
//        System.out.println("expected map:" + expected);

        //System.out.println(rsl);
        return rsl;
    }

}
