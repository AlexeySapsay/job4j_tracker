package ru.job4j.comparator;

import org.junit.Test;
import org.junit.Assert;

import java.util.List;
import java.util.Arrays;

public class CollectionsSortTest {
    @Test
    public void test() {
        List<String> input = Arrays.asList("c", "b", "a");
        List<String> expect = Arrays.asList("a", "b", "c");
        List<String> out = CollectionsSort.sort(input);
        Assert.assertEquals(expect, out);
    }
}