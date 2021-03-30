package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.tracker.Item;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ItemSorterForwardTest {
    @Test
    public void whenCompareForward() {
        List<Item> items = Arrays.asList(
                new Item("Ivan"),
                new Item("Bolvan"),
                new Item("Alex")
        );
        //System.out.println(items);
        Collections.sort(items, new ItemSorterForward());
        //System.out.println(items);

        List<Item> sortedItems = Arrays.asList(
                new Item("Alex"),
                new Item("Bolvan"),
                new Item("Ivan"));

        //assertThat(items,is(sortedItems));
        assertThat(sortedItems, is(items));
    }
}