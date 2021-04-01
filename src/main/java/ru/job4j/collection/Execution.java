package ru.job4j.collection;

import ru.job4j.collection.User;

import java.util.Set;
import java.util.TreeSet;


public class Execution {
    public static void main(String[] args) {
        Set<User> users = new TreeSet<>();
        users.add(new User("Alex", 32));
        users.add(new User("Ded", 60));
        users.add(new User("Mihail", 40));

        System.out.println(users);

    }
}
