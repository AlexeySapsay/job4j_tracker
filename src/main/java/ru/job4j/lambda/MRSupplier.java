package ru.job4j.lambda;

import java.util.*;
import java.util.function.Supplier;

/**
 * Интерфейс Supplier служит для того, чтобы обернуть логику создания объекта.
 * Он ничего не принимает, только возвращает объект, который ему поручили создать. Ссылки на методы
 * поддерживает метод new, который позволяет нам создать нужный нам объект
 * <p>
 * Например,
 * <p>
 * Supplier<List<String>> supplier = ArrayList::new;
 * <p>
 * List<String> list = supplier.get() // вернет ArrayList
 * <p>
 * Ваша задача вернуть Supplier, который создает пустую строку через new
 */
public class MRSupplier {
    public static Supplier<String> supplier() {
        Supplier<String> supplier = String::new;
        return supplier;
    }

    public static Supplier<String> supplier1() {
        Supplier<String> supplier = String::new;
        return supplier;
    }

    public static Supplier<List<String>> supplier2() {
        Supplier<List<String>> supplier = ArrayList::new;
        return supplier;
    }

    public static Supplier<Map<Integer, Integer>> supplier3() {
        Supplier<Map<Integer, Integer>> map = HashMap::new;
        return map;
    }

    public static Supplier<HashMap<Double, Double>> supplier4() {
        Supplier<HashMap<Double, Double>> map = HashMap::new;
        return map;
    }

    public static Supplier<Map<Character, Character>> supplier5() {
        Supplier<Map<Character, Character>> supplier = HashMap::new;
        return supplier;
    }

    public static Supplier<Set<Boolean>> supplier6() {
        Supplier<Set<Boolean>> supplier = HashSet::new;
        return supplier;
    }

    public static Supplier<Set<Byte>> supplier7() {
        Supplier<Set<Byte>> supplier = LinkedHashSet::new;
        return supplier;
    }

    public static Supplier<Set<Short>> supplier8() {
        Supplier<Set<Short>> supplier = TreeSet::new;
        return supplier;
    }

    public static Supplier<Vector<String>> supplier9() {
        Supplier<Vector<String>> supplier = Vector::new;
        return supplier;
    }

    public static Supplier<LinkedList<String>> supplier10() {
        Supplier<LinkedList<String>> supplier = LinkedList::new;
        return supplier;
    }
}
