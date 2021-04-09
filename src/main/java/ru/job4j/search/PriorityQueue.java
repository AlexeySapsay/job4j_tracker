package ru.job4j.search;

import java.util.LinkedList;

/**
 * В Java коллекции представляют собой фреймворк. То есть набор классов,
 * которые можно легко расширить.
 * <p>
 * Все коллекции можно разбить по группам интерфейсов.
 * <p>
 * В предыдущем уроке мы говорили про коллекцию java.util.ArrayList.
 * Этот класс реализует java.util.List.
 * <p>
 * У интерфейса java.util.List есть другая реализация java.util.LinkedList.
 * Этот класс внутри использует связанные списки.
 * <p>
 * Основное отличие этих коллекций - это организация вставки и удаления элементов.
 * Детально про отличия этих реализаций мы поговорим в следующем уровне.
 * <p>
 * Интерфейс java.util.List имеет метод add(index, value).
 * То есть мы можем добавить элемент в нужный индекс.
 * <p>
 * У этого метода интересное поведение. Если ячейка уже занята,
 * то элементы сдвигаются вправо, а не заменяются, как в массиве.
 */

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю приоритет.
     * Для вставки использовать add(int index, E value)
     *
     * @param task задача
     */

    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            // первый случай: элементов нет то индекс равен 0,
            // и вставляем элемент на 0 позицию
//            if (element.getPriority() < task.getPriority()) {
//                index++;
//            }
//            else {
//                break;
//            }
            if (element.getPriority() > task.getPriority()) {
                break;
            }
            index++;
        }
        // вставляем элемент по индексу, значению
        this.tasks.add(index, task);
    }

    // возвращает первый элемент из списка и удаляет его
    public Task take() throws NullPointerException {
        try {
            return tasks.poll();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.add(0, "Petr");
        names.add(0, "Ivan");
        names.add(0, "Stepan");
        for (String value : names) {
            System.out.println(value);
        }
    }
}
