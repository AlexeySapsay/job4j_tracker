package ru.job4j.tracker;

import ru.job4j.tracker.Item;

public class TrackerSingle3 {
    private static final TrackerSingle3 instance = new TrackerSingle3();

    /* статическое финальное поле*/
    private TrackerSingle3() {
    }

    public static TrackerSingle3 getInstance() {
        return instance;
    }

    public static void main(String[] args) {

        TrackerSingle3 tracker = TrackerSingle3.getInstance();
    }
}