package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class TrackerSingleTest {
    @Test
    public void whenTestSingletonEnum() {
        Tracker tracker = new Tracker();
        Tracker tracker1 = new Tracker();

        assertSame(tracker, tracker1);
    }
}