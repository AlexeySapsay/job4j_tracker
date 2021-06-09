package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ConvertArrayIntegerToList1Test {
    @Test
    public void whenConvertThanTrue() {
        Integer[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        ConvertArrayIntegerToList1 sc = new ConvertArrayIntegerToList1();
        List<Integer> real = sc.convert(matrix);
        List<Integer> expected = List.of(
                1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(expected, real);
    }
}