package ru.job4j.stream.exercise;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class CollectToSetTest {
    @Test
    public void test() {
        Set<Integer> input = Set.of(1, 2);
        Set<Integer> expected = Set.of(1, 2);
        assertEquals(expected, CollectToSet.collect(input.stream()));
    }
}