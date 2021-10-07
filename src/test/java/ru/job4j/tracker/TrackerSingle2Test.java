package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerSingle2Test {
    @Test
    public void whenTestSingletonLazyFieldLoading() {
        MemTracker tracker = TrackerSingle2.getInstance();
        MemTracker tracker1 = TrackerSingle2.getInstance();

        assertSame(tracker, tracker1);
    }
}