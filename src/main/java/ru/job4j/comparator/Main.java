package ru.job4j.comparator;
/*https:\\javarush.ru/groups/posts/1939-comparator-v-java*/

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        List<Message> messages = new ArrayList<>();
        messages.add(new Message("Hello, World!"));
        messages.add(new Message("Hello, Sun!"));
        System.out.println(messages);

        Comparator<Message> comparator = new Comparator<>() {
            public int compare(Message obj1, Message obj2) {
                return obj1.getId().compareTo(obj2.getId());
            }
        };

        System.out.println(comparator.compare(messages.get(0), messages.get(1)));
        Comparator<Message> comparator1 = (obj1, obj2) -> obj1.getId().compareTo(obj2.getId());
        System.out.println(comparator1.toString());
    }
}
