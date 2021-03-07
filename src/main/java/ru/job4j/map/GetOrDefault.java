package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://job4j.ru/edu/task_code?topicId=29&taskCodeId=157&solutionId=new_task

public class GetOrDefault {
    private Map<Integer, List<String>> store = new HashMap<>();

    public void addValue(int index, List<String> list) {
        //добавить элемент list(значение) с ключом index в хранилище store только
        // в том случае, если такого ключа пока еще нет в хранилище
        store.putIfAbsent(index, list);
    }

    //Метод getValue() должен вернуть значение которое соответствует ключу index,
    // если такого ключа нет - необходимо вернуть пустой список.
    public List<String> getValue(int index) {
        List<String> emptyList = new ArrayList<String>();
        return store.getOrDefault(index, emptyList);
    }
}
