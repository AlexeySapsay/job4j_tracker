package ru.job4j.collection;

public class SortForTask   {
    public static void main(String[] args) {
        String strLeft = "100. Task.";
        String strRight = "10. Task.";

        LexSort lexSort = new LexSort();
        int rsl = lexSort.compare(strLeft, strRight);
    }
}
