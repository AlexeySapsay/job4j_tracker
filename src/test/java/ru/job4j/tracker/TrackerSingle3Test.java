package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerSingle3Test {
    @Test
    public void whenTestSingletonLazyFieldLoading(){
        Tracker tracker = new Tracker();
        Tracker tracker1 = new Tracker();

        assertSame(tracker, tracker1);
    }

}