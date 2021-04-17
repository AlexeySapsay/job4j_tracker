package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveJustForTest {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();
        System.out.println("original : " + strList);
        strList.add("ivaqn");
        System.out.println(strList.size());
        strList.add("bolvan");
        strList.add("golovan");
        strList.set(2, "test element");
        System.out.println("after set : " + strList);
    }
}
