package ru.job4j.lambda;

import static org.junit.Assert.*;

import org.junit.Test;

public class OptionalGetAndIsPresentTest {

    @Test
    public void whenExist() {
        assertEquals(
                1,
                OptionalGetAndIsPresent.get(
                        new int[]{1, 2, 3},
                        2
                )
        );
    }

    @Test
    public void whenNotExist() {
        assertEquals(
                -1,
                OptionalGetAndIsPresent.get(
                        new int[]{1, 2, 3},
                        4
                )
        );
    }

}