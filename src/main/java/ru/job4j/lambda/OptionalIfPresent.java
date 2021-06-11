package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.ArrayList;

public class OptionalIfPresent {
    public static void ifPresent(int[] data) {
        //Optional<Integer> optional1 = OptionalIfPresent::max;
        //Optional<Integer> optional1 = OptionalIfPresent.ifPresent(max(data));
        Optional<Integer> optional1 = OptionalIfPresent.max(data);
    }

    private static Optional<Integer> max(int[] data) {
        if (data.length == 0) {
            Optional<Integer> optional = Optional.empty();
            return optional;
        }
        Integer maxValue = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //Collections.addAll(arrayList, data.);
        for (int i = 0; i < data.length; i++) {
            arrayList.add(data[i]);
        }
        maxValue = Collections.max(arrayList);
        Optional<Integer> optional = Optional.of(maxValue);
        return optional;
    }
}
