package ru.job4j.queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    /*
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.add("second");
        deque.addFirst("first");
        deque.addLast("third");
        for (String string : deque) {
            System.out.println(string);
        }
    }
    */

    /*
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.add("second");
        deque.addFirst("first");
        deque.addLast("third");

        System.out.println(deque);
        System.out.println(deque.pop());
        System.out.println(deque.poll());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
    }
     */

    /*
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.add("second");
        deque.addFirst("first");
        deque.addLast("third");

        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
     */

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.add("second");
        deque.addFirst("first");
        deque.addLast("third");

        Iterator<String> iterator = deque.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
