package ru.job4j.tracker;

public class TrackerSingle3 {
    /* статическое финальное поле*/
    private static final Tracker INSTANCE = new Tracker();

    private TrackerSingle3() {
    }

    public static Tracker getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {

        Tracker tracker = TrackerSingle3.getInstance();
    }
}