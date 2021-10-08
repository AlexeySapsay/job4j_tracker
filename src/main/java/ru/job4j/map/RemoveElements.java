package ru.job4j.map;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * https://job4j.ru/edu/task_code?topicId=29&taskCodeId=167&solutionId=new_task
 */

public class RemoveElements {
    public static Map<Integer, String> removeElement(Map<Integer, String> data,
                                                     List<Integer> ids,
                                                     List<User> users) {
        /**
         * 1. Удалить все пары ключ-значение которые соответствуют
         *    каждому id из списка id
         */
        for (Integer integer : ids) {
            data.remove((integer));
        }

        /**
         * 2. Удалить все пары ключ значения, которые соответствуют
         *  списку пользователей(тут будет необходимо использовать геттеры,
         *  чтобы получить доступ к значениям в полях объектов типа User).
         */
        for (User user : users) {
            data.remove(user.getId());
        }

        return data;
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
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return id == user.id && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }
}
