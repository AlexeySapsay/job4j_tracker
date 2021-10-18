package ru.job4j.lambda;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class CalculateFunctionsTest {
    @Test
    public void whenLinearFunctionThenLinearResult() {
        List<Double> result = CalculateFunctions.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResult() {
        List<Double> result = CalculateFunctions.diapason(1, 5, x -> x * x);
        List<Double> expected = Arrays.asList(1D, 4D, 9D, 16D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentFunctionThenExponentResult() {
        List<Double> result = CalculateFunctions.diapason(1, 5, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(2D, 4D, 8D, 16D);
        assertThat(result, is(expected));
    }
}