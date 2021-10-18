package ru.job4j.comparator;

import org.junit.Test;

import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class ListSortTest {
    @Test
    public void test() {
        List<String> input = Arrays.asList(null, "a", "b", "c");
        List<String> result = ListSort.sort(input);
        List<String> expect = Arrays.asList("c", "b", "a", null);
        System.out.println(result);
        Assert.assertEquals(expect, result);
    }
}