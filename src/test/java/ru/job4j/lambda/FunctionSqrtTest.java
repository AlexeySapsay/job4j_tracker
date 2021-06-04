package ru.job4j.lambda;

import static org.junit.Assert.*;

import org.junit.Test;

public class FunctionSqrtTest {
    @Test
    public void test() {
        assertEquals(2, FunctionSqrt.calculate(4), 0.01);
        assertEquals(3, FunctionSqrt.calculate(9), 0.01);
    }
}