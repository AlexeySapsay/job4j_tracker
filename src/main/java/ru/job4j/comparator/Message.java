package ru.job4j.comparator;
/*https:\\javarush.ru/groups/posts/1939-comparator-v-java*/

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Message {
    private String message;
    private int id;

    public Message(String message) {
        this.message = message;
        this.id = new Random().nextInt(10);
    }

    public String getMessage() {
        return message;
    }

    public Integer getId() {
        return id;
    }

    public String toString() {
        return "[" + id + "]" + message;
    }
}
