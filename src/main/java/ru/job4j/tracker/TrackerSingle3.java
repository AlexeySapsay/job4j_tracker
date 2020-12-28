package ru.job4j.tracker;

import ru.job4j.tracker.Item;

public class TrackerSingle3 {
    /* статическое финальное поле*/
    private static final Tracker instance = new Tracker();

    private TrackerSingle3() {
    }

    public static Tracker getInstance() {
        return instance;
    }

    public static void main(String[] args) {

        Tracker tracker = TrackerSingle3.getInstance();
    }
}