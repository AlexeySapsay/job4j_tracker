package ru.job4j.set;

/**
 * Выигрышной комбинацией для джекпота в казино считается такая, в которой все элементы одинаковые.
 * <p>
 * Метод принимает массив строк, который содержит последовательность элементов игровой комбинации. Метод должен вернуть true - если комбинация является выигрышной.
 * <p>
 * Напомню, что коллекция Set не допускает наличие дубликатов. Поэтому если все элементы массива добавить в коллекцию типа Set, то размер коллекции будет равен 1 при условии, что комбинация выигрышная.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> strSet = new HashSet<String>(Arrays.asList(combination));
        return (strSet.size() == 1);
    }
}
