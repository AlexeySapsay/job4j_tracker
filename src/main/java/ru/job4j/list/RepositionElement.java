package ru.job4j.list;

import java.util.List;
//https://job4j.ru/edu/task_code?topicId=27&taskCodeId=126&solutionId=new_task

/**
 * Продолжим модифицировать список, познакомимся с методами для удаления элементов в списке и замены элемента по индексу. Для этого предназначены методы set() и remove():
 * <p>
 * E remove(int index) - удаляет элемент из списка по индексу index, при этом метод возвращает удаленный элемент.
 * <p>
 * E set(int index, E e) - заменяет значение элемента, который имеет индекс index, значением e. При этом метод возвращает старое значение элемента с индексом index.
 * <p>
 * Задание:  метод принимает в качестве параметров список и индекс элемента который необходимо заменить. необходимо дописать метод так, чтобы сначала удалялся последний элемент в списке, а потом этим элементом заменить элемент по индексу, который пришел в параметрах метода. Необходимо учесть, что извне могут передать индекс, который превышает значение размера списка. Чтобы этого избежать - необходимо добавить проверку валидности входных параметров.
 */


public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        //validate index data
        if (index > list.size() - 1) {
            String removedElem = list.remove(list.size() - 1);
            return list;
        } else {
            String removedElem = list.remove(list.size() - 1);
            list.set(index, removedElem);
            return list;
        }
    }
}
