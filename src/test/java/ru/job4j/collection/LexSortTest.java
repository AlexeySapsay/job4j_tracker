package ru.job4j.collection;

import static org.hamcrest.Matchers.is;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;

public class LexSortTest {
    @Test
    public void sortNum1and2and10() {
        String[] input = {
                "10. Task.",
                "1. Task.",
                "2. Task."
        };
        String[] out = {
                "1. Task.",
                "2. Task.",
                "10. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }

    @Test
    public void sortNum0and1and2and10and1000() {
        String[] input = {
                "10. Task.",
                "1. Task.",
                "1000. Task.",
                "2. Task.",
                "0. Task."
        };
        String[] out = {
                "0. Task.",
                "1. Task.",
                "2. Task.",
                "10. Task.",
                "1000. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }
}