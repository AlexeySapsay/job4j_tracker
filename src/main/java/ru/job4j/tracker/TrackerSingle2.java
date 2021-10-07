package ru.job4j.tracker;

public class TrackerSingle2 {
    private static MemTracker instance;

    /* статичная ленивая загрузка через поля*/
    TrackerSingle2() {
    }

    public static MemTracker getInstance() {
        if (instance == null) {
            instance = new MemTracker();
        }
        return instance;
    }
}