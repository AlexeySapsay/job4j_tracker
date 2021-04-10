package ru.job4j.tracker;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Tracker {
    //private final Item[] items = new Item[100];
    private final List<Item> items = new ArrayList<Item>(100);

    private int ids = 1;
    private int size = 0;

    //don't remember, maybe remove it
//    public Item add(Item item) {
//        item.setId(ids++);
//        items[size++] = item;
//        return item;
//    }
//
//    public Item add(Item item) {
//        item.setId(ids++);
//        size += 1;
//        items.add(size) = item;
//        //items[size++] = item;
//        return item;
//    }

    // I refactored that method
    public Item add(Item item) {
        item.setId(ids++);
        size += 1;
        items.add(item);
        return item;
    }

    //maybe remove it
//    public Item[] findAll() {
//        return Arrays.copyOf(items, size);
//    }

    // I refactored that method
    public List<Item> findAll() {
        return items.subList(0, size);
    }

    //maybe remove it
//    public Item[] findByName(String key) {
//        Item[] itemsWithoutNull = new Item[items.length];
//        int size = 0;
//        for (int index = 0; index < this.size; index++) {
//            Item itemBuffer = items[index];
//            if (itemBuffer.getName().equals(key)) {
//                itemsWithoutNull[size] = itemBuffer;
//                size++;
//            }
//        }
//        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, size);
//        return itemsWithoutNull;
//    }

    // I refactored that method
    public List<Item> findByName(String key) {
        Item[] itemsWithoutNull = new Item[items.size()];
        int size = 0;
        for (int index = 0; index < this.size; index++) {
            //Item itemBuffer = items[index];
            Item itemBuffer = items.get(index);
            if (itemBuffer.getName().equals(key)) {
                itemsWithoutNull[size] = itemBuffer;
                size++;
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, size);
        //return itemsWithoutNull;
        return List.of(itemsWithoutNull);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            //if (items[index].getId() == id) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        // looking for index
        int index = indexOf(id);
        // if index will not be finds return item, in the other hand
        // return null
        //return index != -1 ? items[index] : null;
        return index != -1 ? items.get(index) : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
//            items[index] = item;
//            items[index].setId(id);
            items.add(index, item);
            items.get(index).setId(id);

        }
        return result;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        int start = index + 1;
        int distPos = index;
        int length = size - index;
        boolean result = index != -1;

        if (result) {
            System.arraycopy(items.toArray(), start, items.toArray(),
                    distPos, length - 1);
            //items[size - 1] = null;
            //items.add((size - 1), null);
            items.add((size), null);
            size--;
            return true;
        }
        return result;
    }
}