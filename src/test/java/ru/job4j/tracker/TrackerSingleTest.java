package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class TrackerSingleTest {
    @Test
    public void whenTestSingletonEnum() {
        MemTracker tracker = TrackerSingle.INSTANCE.getTracker();
        MemTracker tracker1 = TrackerSingle.INSTANCE.getTracker();

        assertSame(tracker, tracker1);
    }
}