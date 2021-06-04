package ru.job4j.lambda;

import java.util.function.Consumer;

public class MethodReference {
    public void applyByInstance() {
        // запись через ссылки на метод.
        // Т.е создается объект класса и у него вызывается необходимый метод
        Consumer<String> consumer = new MethodReference()::consumerByInstance;
        consumer.accept("Hello");
    }

    // через обращение к классу
    public static void applyByClass() {
        Consumer<String> consumer = MethodReference::consumerByClass;
        consumer.accept("Hello");
    }

    private void consumerByInstance(String input) {
        System.out.print("From instance: " + input);
    }

    private static void consumerByClass(String input) {
        System.out.print("From class: " + input);
    }
}
