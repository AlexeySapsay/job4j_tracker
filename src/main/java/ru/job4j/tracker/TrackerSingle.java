package ru.job4j.tracker;

import ru.job4j.tracker.Item;

public enum TrackerSingle {
    instance;

    public static TrackerSingle getInstance() {
        return instance;
    }
}