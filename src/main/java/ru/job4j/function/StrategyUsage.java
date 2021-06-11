package ru.job4j.function;

import java.util.function.Predicate;

public class StrategyUsage {
    public boolean empty(String s) {
        return s.isEmpty();
    }

    public boolean startsWith(String s, String pref) {
        return s.startsWith(pref);
    }

    public boolean contains(String s, String key) {
        return s.contains(key);
    }

    public boolean check(Predicate<String> pred, String s) {
        return pred.test(s);
    }
}
