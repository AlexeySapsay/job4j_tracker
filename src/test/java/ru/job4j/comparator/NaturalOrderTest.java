package ru.job4j.comparator;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Comparator;

public class NaturalOrderTest {
    @Test
    public void test() {
        assertEquals(Comparator.naturalOrder(), NaturalOrder.naturalOrder());
    }
}