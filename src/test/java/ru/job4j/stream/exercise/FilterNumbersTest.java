package ru.job4j.stream.exercise;

import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class FilterNumbersTest {
    @Test
    public void test() {
        assertEquals(List.of(2, 4), FilterNumbers.filter(List.of(1, 2, 3, 4)));
    }
}