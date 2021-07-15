package ru.job4j.stream.exercise;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LimitMethodTest {
    @Test
    public void test() {
        assertEquals(List.of("A", "B", "C"),
                LimitMethod.firsThree(List.of("A", "B", "C", "D", "E")));
    }
}