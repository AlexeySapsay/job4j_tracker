package ru.job4j.stream.exercise;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MinMethod1Test {
    @Test
    public void test() {
        assertEquals(java.util.Optional.of(1).get(), MinMethod1.min(List.of(1, 2, 3)));
    }
}