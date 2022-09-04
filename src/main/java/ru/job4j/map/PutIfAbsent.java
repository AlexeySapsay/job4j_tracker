package ru.job4j.map;



import java.util.Map;
import java.util.Objects;

/**
 * https:\\job4j.ru/edu/task_code?topicId=29&taskCodeId=155&solutionId=new_task
 * Задание: вам необходимо реализовать метод
 * boolean addNewElement(User u), который осуществит
 * добавление нового элемента только при условии,
 * что такого ключа в отображении еще нет.
 * При этом метод должен вернуть булево значение -
 * для этого необходимо проверить содержит ли
 * отображение значение u. В отображении ключом
 * является id пользователя, значением - объект типа User.
 */

public class PutIfAbsent {

    private final Map<Integer, User> users;

    public PutIfAbsent(Map<Integer, User> users) {
        this.users = users;
    }

    public boolean addNewElement(User u) {
        users.putIfAbsent(u.getId(), u);

        if (users.containsValue(u)) {
            return true;
        }
        return false;
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

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
