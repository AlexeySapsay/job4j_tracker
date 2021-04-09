package ru.job4j.collection;

import java.util.Objects;

public class User implements Comparable<User> {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(User o) {
        // сравниваем по именам используая стандартную реализацию
        // compareTo из String
        int res = this.name.compareTo(o.name);

        //если имена совпадают, используем стандартную реализацию
        // compareTo из Integer
        if (res == 0) {
            res = Integer.compare(this.age, o.age);
        }
        return res;
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
    public String toString() {
        return String.format("name : " + name + " has age : " + age + '\n');
    }
}
