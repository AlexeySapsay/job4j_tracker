package ru.job4j.tracker;

import ru.job4j.tracker.Item;

public class TrackerSingle2 {
    private static Tracker instance;

    /* статичная ленивая загрузка через поля*/
    TrackerSingle2() {
    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }
}