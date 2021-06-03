package ru.job4j.lambda;

import static org.junit.Assert.*;

import org.junit.Test;

public class FunctionPowTest {
    @Test
    public void testFunction() {
        assertEquals(4, FunctionPow.calculate(2), 0.01);
        assertEquals(9, FunctionPow.calculate(3), 0.01);
        assertEquals(16, FunctionPow.calculate(4), 0.01);
        assertEquals(25, FunctionPow.calculate(5), 0.01);
        assertEquals(36, FunctionPow.calculate(6), 0.01);
        assertEquals(49, FunctionPow.calculate(7), 0.01);
    }
}