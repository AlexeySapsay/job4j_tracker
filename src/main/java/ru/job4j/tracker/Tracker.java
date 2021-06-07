package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = items.size();

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    //    public List<Item> findAll() {
//        return List.copyOf(items);
//    }

//    public Item[] findAll() {
//        return Arrays.copyOf(items, size);
//    }

    public Item[] findAll() {
        //return (Item[]) Arrays.copyOf(items.toArray(), items.size());
        //return (Item[]) Arrays.copyOf(items.toArray(), size);
        //return new Item[].clone(items);
        Item[] buffItemArr = new Item[items.size()];
        items.toArray(buffItemArr);
        return buffItemArr;
    }

    public List<Item> findByName(String key) {
        List<Item> itemsWithoutNull = new ArrayList<>(items.size());

        for (Item item : items) {
            if (item.getName().equals(key)) {
                itemsWithoutNull.add(item);
            }
        }
        return itemsWithoutNull;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            items.set(index, item);
            items.get(index).setId(id);
        }
        return result;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (index != -1) {
            items.remove(index);
        }
        return result;
    }
}