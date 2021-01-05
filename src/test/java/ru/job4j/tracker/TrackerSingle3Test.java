package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerSingle3Test {
    @Test
    public void whenTestSingletonLazyFieldLoading(){
        Tracker tracker = TrackerSingle3.getInstance();
        Tracker tracker1 = TrackerSingle3.getInstance();

        assertSame(tracker, tracker1);
    }

}