package ru.job4j.map;

// https://job4j.ru/edu/task_code?topicId=29&taskCodeId=158&solutionId=new_task

import java.util.Map;

public class ComputeIfPresent {
    public static Map<Integer, String> collectData(
            Map<Integer, String> name, Map<Integer, String> surname) {
        name.computeIfPresent(1, (key, value) -> value + " " + surname.get(1));
        name.computeIfPresent(2, (key, value) -> value + " " + surname.get(2));
        return name;
    }
}
