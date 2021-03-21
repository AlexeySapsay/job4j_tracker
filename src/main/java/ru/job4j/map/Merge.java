package ru.job4j.map;

//https://job4j.ru/edu/task_code?topicId=29&taskCodeId=162&solutionId=new_task

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Merge {
    public static Map<Integer, String> collectData(Map<Integer, String> names, List<User> users) {
        // Необходимо обновить информацию - если такой пользователь уже существует
        // (проверять по ключу) - то необходимо к имени добавить фамилию,
        //System.out.println("old HashMap" + names);

        //если нет - то сначала добавить пользователя - ключ id, значение
        // - имя пользователя, а потом только обновить и добавить фамилию.
        // При решении используйте методы putIfAbsent() и merge().

        for (User user : users) {
            names.putIfAbsent(user.getId(), user.name);
        }
        //System.out.println("New HashMap + name" + names);

        for (User user : users) {
            names.merge(user.getId(), user.getSurname(), (oldValue, newValue) ->
                    oldValue + " " + newValue);
        }
        //System.out.println("New HashMap + name + surname " + names);

        return names;
    }

    public static class User {
        private int id;
        private String name;
        private String surname;

        public User(int id, String name, String surname) {
            this.id = id;
            this.name = name;
            this.surname = surname;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return id == user.id;
        }
    }
}
