package ru.job4j.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueRunner {

/*    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");

        for (String string : queue) {
            System.out.println(string);
        }
    }
*/

/*
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");
        System.out.println("State of Queue before remove: ");
        for (String string : queue) {
            System.out.println(string);
        }
        queue.remove();
        System.out.println();
        System.out.println("State of Queue after remove: ");
        for (String string : queue) {
            System.out.println(string);
        }
    }
 */

    /*
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");
        System.out.println("State of Queue before remove: ");
        for (String string : queue) {
            System.out.println(string);
        }
        queue.poll();
        System.out.println();
        System.out.println("State of Queue after remove: ");
        for (String string : queue) {
            System.out.println(string);
        }
    }
     */
   /*
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");

        for (String string : queue) {
            System.out.println(string);
        }
    }

    */

    /*
    public static void main(String[] args) {
        Queue<String> queue = new ArrayBlockingQueue<>(3);
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        queue.offer("fourth");

        for (String string : queue) {
            System.out.println(string);
        }
    }

     */

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");

        System.out.println(queue.peek());

        System.out.println(queue.poll());

    }
}
