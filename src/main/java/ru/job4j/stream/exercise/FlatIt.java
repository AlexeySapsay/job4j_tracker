package ru.job4j.stream.exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

//https://job4j.ru/profile/topics/3/task_code/14/solution/new_task

//подсказку к задаче взял с сайта стэковерфлов
//https://stackoverflow.com/questions/41877611/integer-
// sequences-in-iterator-of-iterators-java
public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
//        List<Iterator> listIterators = new ArrayList<>();
        List<Integer> listInteger = new ArrayList<>();
//        while (it.hasNext()) {
//            listIterators.add(it.next());
//        }
//        List<Integer> listInteger = new ArrayList<>();
//        for (Iterator iterator : listIterators) {
//            while (iterator.hasNext()) {
//                listInteger.add((Integer) iterator.next());
//            }
//        }

//        it.forEachRemaining(subIt ->
//                subIt.forEachRemaining((value ->
//                        listInteger.add(value))));
        it.forEachRemaining(subIt ->
                subIt.forEachRemaining(listInteger::add));
        return listInteger;

//        List<Integer> integerList = new ArrayList<>();
//        while(it.hasNext()){
//            while(it.hasNext()){
//                integerList.add(it.next()){
//
//                }
//            }
//        }

        //return (it.next().next());
    }
}
