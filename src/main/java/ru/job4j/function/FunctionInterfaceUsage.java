package ru.job4j.function;

import java.util.function.Supplier;
import java.util.function.BiConsumer;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.function.Consumer;

public class FunctionInterfaceUsage {
    public static void main(String[] args) {
//        Supplier<String> sup = () -> "New String for Interface";
//        System.out.println(sup.get());
        // example for consumer
//        Supplier<String> sup = () -> "New String For Interface";
//        Consumer<String> consumer = (s) -> System.out.println(s);
//        consumer.accept(sup.get());

        // example for BiConsumer
//        Supplier<String> sup = () -> "New String For Interface";
//        BiConsumer<String, String> consumer = (s, s1) -> System.out.println(s + s1);
//        String str = " and Second String";
//        consumer.accept(sup.get(), str);

//        Supplier<String> sup2 = () -> "String number2 for interface";
//        System.out.println(sup2.get());
//
//        Supplier<String> sup3 = () -> "String numb3";
//        System.out.println(sup3.get());
//
//        Supplier<String> sup4 = () -> "I like functional interface";
//        System.out.println(sup4.get());
//
//        Supplier<String> sup5 = () -> "Practice make perfect";
//        System.out.println(sup5.get());

//        List<String> list = List.of("one", "two", "three", "one", "two", "three");
//        Supplier<Set<String>> supSet = () -> new HashSet<>(list);
//        System.out.println(supSet.get().getClass());
//        Set<String> strings = supSet.get();
//        //System.out.println(strings.getClass());
//        for (String s : strings) {
//            System.out.println(s);
//        }

        // example with BiConsumer and collection
        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> sup = () -> new HashSet<>(list);
        BiConsumer<Integer, String> consumer = (s, s1) -> System.out.println(s + s1);
        Set<String> strings = sup.get();
        int i = 1;
        for (String s : strings) {
            consumer.accept(i++, " is " + s);
        }
    }
}
