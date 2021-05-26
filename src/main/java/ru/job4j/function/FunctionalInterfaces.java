package ru.job4j.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        List<String> list = List.of("one", "two", "three", "four", "five", "six", "seven");
        Supplier<List<String>> sup = () -> new ArrayList<String>(list);
        BiConsumer<Integer, String> biCon = (s, s1) -> System.out.println(s + s1);
        List<String> strings = sup.get();
        int i = 1;
        for (String s : strings) {
            map.put(i++, s);
        }
        //System.out.println(map);

        BiPredicate<Integer, String> biPred = (k, s) -> (k % 2 == 0 || map.get(k).length() == 4);
        for (Integer j : map.keySet()) {
            /*
                Замените проверку в if() на использование BiPredicate,
                он объявлен выше, требуется его реализовать.
             */
//            if (i % 2 == 0 || map.get(i).length() == 4) {
//                System.out.println("key: " + i + " value: " + map.get(i));
//            }
            if (biPred.test(j, map.get(j))) {
                //System.out.println("key: " + j + " value: " + map.get(j));
            }
        }

        /*
            Заменить создание ArrayList из значений Map на Supplier,
             объявлен ниже, требуется его реализовать.
         */
        Supplier<List<String>> sup1 = () -> new ArrayList<String>(map.values());
        List<String> strings1 = new ArrayList<>(map.values());
        //System.out.println(sup1);
        //System.out.println(strings1);


        //Consumer<String> con = (s) -> System.out.println(s);
        //Consumer<List<String>> con = (s) -> System.out.println(map.values());
        //Consumer<String> con = (map.keySet()) -> System.out.println(map.get(map.keySet()));
        Consumer<String> con = (s) -> System.out.println("fuck");
        con.accept(sup1.get().toString());
//        Function<String, String> func = ...;
        for (String s : strings) {
            /*
                Заменить вывод строк на применение Consumer
                Заменить преобразование строк к строкам в верхнем
                регистре с помощью Function
                Необходимое объявлено выше, требуется их реализовать.
            */
            con.accept(sup1.get().toString());
            //System.out.println(s.toUpperCase());
        }
    }
}
