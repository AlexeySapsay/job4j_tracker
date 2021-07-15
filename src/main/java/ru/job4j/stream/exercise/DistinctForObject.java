package ru.job4j.stream.exercise;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**If we use the distinct () method for objects, then we need to understand
 * that this method uses the equals method to test the equality of objects.
 *  Therefore, if you want to eliminate duplicate objects, you need to override
 *  the equals method in the class

 For example, for the String class, the equals method is overridden, so we can do
 this

 List.of ("a", "b", "c", "a", "b"). Stream (). Distinct () // get a stream from
 "a", "b", "c"

 Your task is to get a list of unique users. You shouldn't pay attention to the
 fact that the hashcode methods are overridden, it is overridden, because this
 must be done when overriding equals.
 *
 *
 */
public class DistinctForObject {
    public static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
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
            return age == user.age
                    && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    public static List<User> distinct(List<User> users) {
        return users.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
