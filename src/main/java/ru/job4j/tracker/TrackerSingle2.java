package ru.job4j.tracker;

import ru.job4j.tracker.Item;

public class TrackerSingle2 {
    private static TrackerSingle2 instance;
    /* статичная ленивая загрузка через поля*/
    TrackerSingle2() {
    }

    public static TrackerSingle2 getInstance() {
        if (instance == null) {
            instance = new TrackerSingle2();
        }
        return instance;
    }
}