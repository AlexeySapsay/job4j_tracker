package ru.job4j.stream.exercise;

import java.util.List;

public class ReduceMethodOneArgument {
    public static Integer reduce(List<Integer> list) {
        return list.stream().reduce((accumulator, element) ->
                accumulator * element).get();
    }
}
