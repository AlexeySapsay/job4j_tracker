package ru.job4j.stream.exercise;

import java.util.List;
import java.util.stream.Collectors;

/** Method create a List with User(int age) from List ages
 *
 */
public class UserMap {
    public static class User {
        private int age;

        public User(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }

    public static List<User> map(List<Integer> ages) {
        return ages.stream()
                //.map(age -> new User(age)).collect(Collectors.toList());
                .map(User::new).collect(Collectors.toList());
    }
}
