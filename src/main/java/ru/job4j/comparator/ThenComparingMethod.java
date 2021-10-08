package ru.job4j.comparator;
/**
 * https://job4j.ru/edu/task_code?topicId=30&taskCodeId=144&solutionId=new_task
 */

import java.io.OutputStream;
import java.util.*;

public class ThenComparingMethod {
    public static void main(String[] args) {
        /*User user1 = new User("Alex", 100);*/
        /*User user2 = new User("Bichail", 200);*/
        /*User user3 = new User("Catia", 300);*/
        /*User user4 = new User("Blexander", 400);*/

        User user1 = new User("Alex", 100);
        User user2 = new User("Alex", 200);
        User user3 = new User("Alex", 300);
        User user4 = new User("Blexander", 400);

        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        System.out.println("original users : " + users);

        Comparator<User> comparator = Comparator.naturalOrder();
        Comparator<User> merged = comparator.thenComparing(ascByName().
                thenComparing(descByAge()));
        Collections.sort(users, merged);

        System.out.println("users after : " + users);
    }

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
        public String toString() {
            return "User{"
                    + "name='" + name + '\''
                    + ", age=" + age
                    + '}';
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

        /* метод- затычка, т.к его переопределяем уже в компараторах*/
        @Override
        public int compareTo(User anotherUser) {
            return 0;
        }
    }

    public static Comparator<User> thenComparing() {
        Comparator<User> comparator = Comparator.naturalOrder();
        Comparator<User> merged = comparator.thenComparing(ascByName().thenComparing(descByAge()));
        return merged;
    }

    public static Comparator<User> ascByName() {
        return new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
    }

    /* remove it after all*/
    public static Comparator<User> descByName() {
        return new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o2.getName().compareTo(o1.getName());
            }
        };
    }

    /*remove it after all*/
    public static Comparator<User> ascByAge() {
        return new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
    }

    public static Comparator<User> descByAge() {
        return new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
        };
    }
}
