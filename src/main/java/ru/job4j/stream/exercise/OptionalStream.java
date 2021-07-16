package ru.job4j.stream.exercise;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalStream {
    public static class PhoneNumber {
        private String phone;

        public PhoneNumber(String phone) {
            this.phone = phone;
        }

        public String getPhone() {
            return phone;
        }
    }

    public static class User {
        private int id;
        private List<PhoneNumber> numbers;

        public User(int id, List<PhoneNumber> numbers) {
            this.id = id;
            this.numbers = numbers;
        }

        public int getId() {
            return id;
        }

        public List<PhoneNumber> getNumbers() {
            return numbers;
        }
    }

    public static List<PhoneNumber> collectNumber(List<User> users,
                                                  int id, String region) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .map(User::getNumbers)
                .flatMap(subList -> subList.stream())
                .distinct()
                .map(o -> o.getPhone())
                .filter(p -> p.startsWith(region))
                .map(o -> new PhoneNumber(o))
                .collect(Collectors.toList());
    }
}
