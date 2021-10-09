package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.tracker.Item2;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Assert;

public class ItemSorterBackwardTest {
    @Test
    public void whenCompareBackward() {
        List<Item2> items = Arrays.asList(
                new Item2("Felix"),
                new Item2("Alex"),
                new Item2("Ivan")
        );
        Collections.sort(items, new ItemSorterBackward());

        List<Item2> sortedItems = Arrays.asList(
                new Item2("Ivan"),
                new Item2("Felix"),
                new Item2("Alex")
        );
        Assert.assertEquals(sortedItems, items);
    }
}