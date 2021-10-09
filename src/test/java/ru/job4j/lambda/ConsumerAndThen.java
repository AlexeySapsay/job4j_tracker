package ru.job4j.lambda;

import java.util.function.Consumer;

/**
 * Интерфейс Consumer позволяет, что-то сделать с переданным объектом,
 * при этом ничего не возвращая.
 * <p>
 * Например,
 * <p>
 * Consumer<Integer> con = (num) -> System.out.println(num + 1);
 *  при вызове метода accept(1) выведется 2
 * <p>
 * Consumer также содержит метод andThen(consumer), в который мы можем
 * передать еще один Consumer,
 * который выполниться после того, у которого вызывали этот метод.
 * <p>
 * Например,
 * <p>
 * Consumer<Integer> con2 = (num) -> System.out.println(num * num);
 * <p>
 * con.andThen(con2); con.apply(2) выведет 3 и 4
 * <p>
 * Ваша задача совместить два Consumer, первый выводит строку через
 * System.out.print,
 * а второй приписывает переход на новую строку через System.out.println
 */
public class ConsumerAndThen {
    public static Consumer<String> consumer(String input) {
        Consumer<String> print = pr -> System.out.print(pr);
        Consumer<String> ln = pr -> System.out.println();

        return print.andThen(ln);
    }
}
