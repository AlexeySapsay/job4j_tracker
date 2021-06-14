package ru.job4j.search;
//https://job4j.ru/edu/task?action=task&taskId=0873958f758d0d5301758d8a565b2e40&number=402105

import java.util.LinkedList;
/**
 * Класс описывает работу простейшей очереди по приоритету, которая работает
 * по принципу FIFO (first in - first out)
 *
 * @author STAS KOROBEYNIKOV
 * @version 1.0
 */
public class PriorityQueue {
    /**
     * хранение задания task осуществляется в коллекции типа LinkedList
     */
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * первый случай: элементов нет то индекс равен 0,
     * и вставляем элемент на 0 позицию
     *
     * @param task - задача помещаемая в колецию
     */
    public void put(Task task) {
        int index = 0;
        for (var element : tasks) {
            if (element.getPriority() > task.getPriority()) {
                break;
            }
            index++;
        }
        // вставляем элемент по индексу, значению
        this.tasks.add(index, task);
    }

    /**
     * Метод возвращает первый элемент из списка и удаляет его.
     *
     * @return возвращает задачу из головы очереди или null
     * если очередь пуста
     */

    public Task take() throws NullPointerException {
        try {
            return tasks.poll();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add(0, "Petr");
        names.add(0, "Ivan");
        names.add(0, "Stepan");
        for (var value : names) {
            System.out.println(value);
        }
    }
}
