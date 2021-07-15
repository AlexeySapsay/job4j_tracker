package ru.job4j.stream.exercise;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A list of users is given. You only need to
 * keep users whose name begins with the letter "B" and whose age is> 18.
 */
public class FilterObject {
    public static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static List<User> filter(List<User> users) {
        return users.stream()
                .filter(user -> user.getName().startsWith("B"))
                .filter(user -> user.getAge() > 18)
                .collect(Collectors.toList());
    }
}
