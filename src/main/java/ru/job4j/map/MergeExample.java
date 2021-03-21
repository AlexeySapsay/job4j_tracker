package ru.job4j.map;

import java.util.Map;
import java.util.HashMap;

public class MergeExample {
    public static void main(String[] args) {
        HashMap<String, Integer> prices = new HashMap<>();
        prices.put("shoes", 100);
        prices.put("Tshirt", 200);
        prices.put("boot", 300);
        System.out.println("HashMap: " + prices);

        int returnedValue = prices.merge("Shirt", 220, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("Price of Shirt : " + returnedValue);

        System.out.println("Updated HashMap: " + prices);

        returnedValue = prices.merge("foo", 100500, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("Updated HashMap: " + prices);

        returnedValue = prices.merge("foo", 100500, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("Updated HashMap: " + prices);

        returnedValue = prices.merge("foo", 100500, (oldValue, newValue) -> 1);
        System.out.println("Updated HashMap: " + prices);

        returnedValue = prices.merge("foo", 100500, (oldValue, newValue) -> oldValue * newValue);
        System.out.println("Updated HashMap: " + prices);

    }
}
