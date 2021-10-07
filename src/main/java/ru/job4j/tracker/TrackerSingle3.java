package ru.job4j.tracker;

public class TrackerSingle3 {
    /* статическое финальное поле*/
    private static final MemTracker INSTANCE = new MemTracker();

    private TrackerSingle3() {
    }

    public static MemTracker getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {

        MemTracker tracker = TrackerSingle3.getInstance();
    }
}