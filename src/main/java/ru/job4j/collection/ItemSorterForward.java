package ru.job4j.collection;
import ru.job4j.tracker.Item2;

import java.util.Comparator;

public class ItemSorterForward implements Comparator<Item2>  {
    @Override
    public int compare(Item2 first, Item2 second) {
        return first.getName().compareTo(second.getName());
    }
}
