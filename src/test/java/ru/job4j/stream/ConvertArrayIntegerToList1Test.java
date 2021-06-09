package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ConvertArrayIntegerToList1Test {
    @Test
    public void whenConvertThanTrue() {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2, 3),
                List.of(3, 4, 5),
                List.of(6, 7, 8)
        );

        ConvertArrayIntegerToList1 sc = new ConvertArrayIntegerToList1();
        List<Integer> rsl = sc.convert(matrix);
        List<Integer> expected = List.of(
                1, 2, 3, 3, 4, 5, 6, 7, 8);

        assertEquals(expected, rsl);
    }
}