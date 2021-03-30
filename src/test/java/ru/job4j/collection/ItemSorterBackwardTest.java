package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.tracker.Item;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

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

//        List<Item> sortedItems = Arrays.asList(
//                new Item("Ivan"),
//                new Item("Felix"),
//                new Item("Alex")
//        );

        List<Item> sortedItems = Arrays.asList(
                new Item("Ivan"),
                new Item("Felix"),
                new Item("Alex")
        );
        //assertArrayEquals(sortedItems.toArray(), is(items.toArray()));
        //assertEquals(new HashSet<Item>(sortedItems),new HashSet<Item>(items));
        //assertTrue(sortedItems.equals(items));

        Assert.assertEquals(sortedItems, items);
    }
}