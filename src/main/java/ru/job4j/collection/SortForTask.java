package ru.job4j.collection;

import java.util.Comparator;

public class SortForTask   {
    public static void main(String[] args) {
        String strLeft = "100. Task.";
        String strRight = "10. Task.";

        //System.out.println("resulb ty String.compareTo() :" +
       //         strLeft.compareTo(strRight));
        LexSort lexSort = new LexSort();
        int rsl = lexSort.compare(strLeft, strRight);
        //System.out.println("resulb by compare: "+ rsl);
    }
}
