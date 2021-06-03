package ru.job4j.lambda;

import static org.junit.Assert.*;

import org.junit.Test;

public class PredicateCheckEvenAndPositiveTest {
    @Test
    public void test() {
        assertTrue(PredicateCheckEvenAndPositive.check(4));
        assertFalse(PredicateCheckEvenAndPositive.check(-2));
        assertFalse(PredicateCheckEvenAndPositive.check(1));
    }
}