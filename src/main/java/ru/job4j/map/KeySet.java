package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;

/**
 *https:\\job4j.ru/edu/task_code?topicId=29&taskCodeId=156&solutionId=new_task
 */

public class KeySet {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(
                Map.of(1, "root@root",
                        2, "local@local",
                        3, "host@host")
        );
        for (int i = 1; i < map.size() + 1; i++) {
            System.out.println(map.keySet().toArray()[i - 1] + " - " + map.get(i));
        }
    }
}
