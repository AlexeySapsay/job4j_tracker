package ru.job4j.list;

public class TaskJustForTest {
    public static void main(String[] args) {
        String a = "ABCD";
        String b = a.toLowerCase();
        String c;
        c = b.replace('a', 'd');
        b.replace('b', 'c');
        c = c.replace('b', 'c');
        System.out.println(b);
        System.out.println(c);
    }
}
