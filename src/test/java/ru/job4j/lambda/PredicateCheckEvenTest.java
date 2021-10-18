package ru.job4j.lambda;

import static org.junit.Assert.*;
import org.junit.Test;

public class PredicateCheckEvenTest {
    @Test
    public void test() {
        assertTrue(PredicateCheckEven.check(2));
        assertFalse(PredicateCheckEven.check(1));
    }
}