package ru.job4j.lambda.exercise;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalOrElseThrow {
    public static class User {
        private String login;

        public User(String login) {
            this.login = login;
        }

        public String getLogin() {
            return login;
        }
    }

    public static class UserNotFoundException extends RuntimeException {

    }

    public static User orElseThrow(List<User> list, String login) {
        return Optional.of(search(list, login)).get()
                .orElseThrow(UserNotFoundException::new);
    }

    private static Optional<User> search(List<User> list, String login) {
        Optional<User> user = Optional.empty();

        List<User> userLoginBuff = list.stream()
                .map(user1 -> user1.getLogin())
                .filter(userLogin -> userLogin.equals(login))
                .map(userB -> new User(login))
                .collect(Collectors.toList());

        if (userLoginBuff.isEmpty()) {
            return user;
        }
        user = Optional.of(userLoginBuff.get(0));
        return user;
    }
}
