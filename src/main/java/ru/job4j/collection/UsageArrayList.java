package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrstr = new ArrayList<String>();

        arrstr.add("Ivan");
        arrstr.add("Alex");
        arrstr.add("Felix");

        for (String name : arrstr) {
            System.out.println(name);
        }
    }
}
