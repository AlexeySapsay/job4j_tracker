package ru.job4j.stream.exercise;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *https://job4j.ru/profile/topics/3/task_code/96/solution/new_task
 */

public class GroupMethod {
    public static class User {
        private int age;
        private String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            User user = (User) o;

            if (age != user.age) {
                return false;
            }
            return name != null ? name.equals(user.name) : user.name == null;
        }

        @Override
        public int hashCode() {
            int result = age;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }
    }

    public static Map<Integer, List<User>> groupBy(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::getAge));
    }
}
