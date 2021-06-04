package ru.job4j.lambda;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.function.Predicate;

public class MRPredicateTest {
    @Test
    public void test() {
        Predicate<String> predicate = MRPredicate.predicate();
        assertTrue(predicate.test(""));
        assertFalse(predicate.test("1"));
    }
}