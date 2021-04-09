package ru.job4j.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Важной особенностью интерфейса Set является то, что в нем не определен метод,
 * который позволяет напрямую получить значение из множества
 * (по аналогии с List, у Set нет метода get()). Что же делать? Ведь нам же как-то
 * надо получать значения.
 * Для этого можно использовать Iterator, который работает по тому же принципу как у List
 * (поскольку оба интерфейса наследуются от Collection).
 * <p>
 * Iterator<E> iterator() - метод возвращает объект Iterator,
 * который позволяет обойти весь набор значений.
 * <p>
 * В интерфейсе Iterator определены важные методы:
 * <p>
 * boolean hasNext() - метод проверяет существует ли следующий элемент в наборе.
 * <p>
 * E next() - метод перемещает курсор на следующий элемент в наборе и при этом возвращает его.
 * <p>
 * Задание: вам необходимо раскомментировать код, заполнить коллекцию строками от one до five.
 * Потом заполнить пропуски (обозначены ...) так, чтобы в цикле печатались строки пока они есть,
 * при этом на каждой итерации выводилось сообщение, что значение существует в наборе.
 */

public class SetIterator {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>(Set.of("one", "two", "three", "four", "five"));
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(String.format("Next element exist? - %s.", iterator.hasNext()));
            System.out.println(iterator.next());
        }
    }
}
