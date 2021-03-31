package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.tracker.Item;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Assert;

public class ItemSorterBackwardTest {
    @Test
    public void whenCompareBackward() {
        List<Item> items = Arrays.asList(
                new Item("Felix"),
                new Item("Alex"),
                new Item("Ivan")
        );
        Collections.sort(items, new ItemSorterBackward());

        List<Item> sortedItems = Arrays.asList(
                new Item("Ivan"),
                new Item("Felix"),
                new Item("Alex")
        );
        Assert.assertEquals(sortedItems, items);
    }
}