package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.tracker.Item2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ItemSorterForwardTest {
    @Test
    public void whenCompareForward() {
        List<Item2> items = Arrays.asList(
                new Item2("Ivan"),
                new Item2("Bolvan"),
                new Item2("Alex")
        );
        Collections.sort(items, new ItemSorterForward());

        List<Item2> sortedItems = Arrays.asList(
                new Item2("Alex"),
                new Item2("Bolvan"),
                new Item2("Ivan"));
        assertThat(sortedItems, is(items));
    }
}