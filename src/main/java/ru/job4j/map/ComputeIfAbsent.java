package ru.job4j.map;
//https://job4j.ru/edu/task_code?topicId=29&taskCodeId=159&solutionId=new_task

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ComputeIfAbsent {
    public static Map<Integer, String> collectData(Map<Integer, String> names, List<User> users) {
        //1. Если такой ключ уже есть в отображении - метод должен обновить
        // ассоциацию(используйте computeIfPresent()).
        for (Integer keyVar : names.keySet()) {
            names.computeIfPresent(keyVar, (key, value) -> value + users.get(key - 1).getName());
        }

        //2. Если такого ключа нет - метод должен добавить
        // ассоциацию(используйте computeIfAbsent()).
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
