package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

/**
 * https:\\job4j.ru/edu/task?action=task&taskId=0873958f758d0d5301758d8a58402e58&number=402129
 */

public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();

        /*for orders*/
        for (Order order : orders) {
            map.put(order.getNumber(), order);
        }
        return map;
    }
}
