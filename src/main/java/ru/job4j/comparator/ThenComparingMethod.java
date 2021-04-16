package ru.job4j.comparator;
//https://job4j.ru/edu/task_code?topicId=30&taskCodeId=144&solutionId=new_task

import java.util.Comparator;
import java.util.Objects;

public class ThenComparingMethod {
    public static class User implements Comparable<User> {
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

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return age == user.age && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public int compareTo(User o) {
            return 0;
        }
    }

    public static Comparator<User> thenComparing() {
        //return Comparator.naturalOrder().thenComparing();
        //return Comparator.naturalOrder().thenComparing();
        //return User::compareTo;
        //return Comparator.naturalOrder().thenComparing(Comparator.reverseOrder().);

        return null;
    }

    public static Comparator<User> ascByName() {
        return Comparator.naturalOrder();
    }

    public static Comparator<User> descByAge() {
        return Comparator.reverseOrder();
    }
}
