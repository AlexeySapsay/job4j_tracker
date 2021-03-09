package ru.job4j.map;
//https://job4j.ru/edu/task_code?topicId=29&taskCodeId=159&solutionId=new_task

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ComputeIfAbsent {
    public static Map<Integer, String> collectData(Map<Integer, String> names, List<User> users) {
        //1. Если такой ключ уже есть в отображении - метод должен обновить
        // ассоциацию(используйте computeIfPresent()).

//        names.computeIfPresent(1, (key, value) -> value + users.get(key - 1).getName());
//        names.computeIfPresent(2, (key, value) -> value + users.get(key - 1).getName());
//        names.computeIfPresent(3, (key, value) -> value + users.get(key - 1).getName());
//        names.computeIfPresent(4, (key, value) -> value + users.get(key - 1).getName());

        for (Integer keyVar : names.keySet()) {
            names.computeIfPresent(keyVar, (key, value) -> value + users.get(key - 1).getName());
        }

        //2. Если такого ключа нет - метод должен добавить
        // ассоциацию(используйте computeIfAbsent()).
//        names.computeIfAbsent(1, key -> "name" + key);
//        names.computeIfAbsent(2, key -> "name" + key);
//        names.computeIfAbsent(3, key -> "name" + key);
//        names.computeIfAbsent(4, key -> "name" + key);

//        for (Integer keyVar : !names.keySet()) {
//            names.computeIfAbsent(keyVar, key -> "name" + key);
//        }

        for (User keyVarUser : users) {
            names.computeIfAbsent(keyVarUser.id, key -> "name" + key);
        }

        return names;
    }

    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ComputeIfAbsent.User user = (ComputeIfAbsent.User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(name);
        }
    }
}
