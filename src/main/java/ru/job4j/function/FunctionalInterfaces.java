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
        BiConsumer<Integer, String> biCon = (s, s1) -> System.out.println(s + s1);
        int i = 1;
        for (String s : list) {
            map.put(i++, s);
        }

        BiPredicate<Integer, String> biPred = (k, s) -> (k % 2 == 0 || map.get(k).length() == 4);
        for (Integer j : map.keySet()) {
            if (biPred.test(j, map.get(j))) {
                System.out.println("key: " + j + " value: " + map.get(j));
            }
        }

        Supplier<List<String>> sup1 = () -> new ArrayList<String>(map.values());
        List<String> strings1 = sup1.get();
        Consumer<String> con = (s) -> System.out.println(s);

        Function<String, String> func = s -> s.toUpperCase();
        for (String s : strings1) {
            con.accept(func.apply(s));
        }
    }
}
