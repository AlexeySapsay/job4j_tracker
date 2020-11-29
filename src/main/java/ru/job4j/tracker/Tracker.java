package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 0;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] itemesWithoutNull = new Item[items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            Item itemBuffer = items[index];
            if (itemBuffer != null) {
                itemesWithoutNull[size] = itemBuffer;
                size++;
            }
        }
        itemesWithoutNull = Arrays.copyOf(itemesWithoutNull, size);
        return itemesWithoutNull;
    }

    public Item[] findByName(String key) {
        Item[] itemsWithoutNull = new Item[items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            Item itemBuffer = items[index];
            if (itemBuffer.getName().equals(key)) {
                itemsWithoutNull[size] = itemBuffer;
                size++;
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, size);
        return itemsWithoutNull;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }


    public Item findById(int id) {
        // looking for index
        int index = indexOf(id);
        // if index wiil not be finde returne item, in the other hand
        // return null
        return index != -1 ? items[index] : null;
    }


    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            items[index] = item;
            return true;
        }
        return false;
    }
}