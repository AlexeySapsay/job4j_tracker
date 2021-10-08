package ru.job4j.function;

import java.util.function.Function;

public class StringTransform {
    public static void main(String[] args) {
        StringTransform stringTransform = new StringTransform();

        System.out.println("Строка просле преобразования: "
                + stringTransform.transform(str -> str.toUpperCase(), "aBCdEfghKLmnpRstU"));

        System.out.println(stringTransform.transform(str -> str.concat("работает корректно"),
                "Строка просле преобразования: "));

        System.out.println("Строка просле преобразования: " + stringTransform.transform(
                str -> str.trim(), "    aBC dEfghK Lmnp RstU        "));

        System.out.println("Строка просле преобразования: "
                + stringTransform.transform(str -> str.replaceAll("a", "Z"),
                "aBC dEfgaK amna RstU  aaa"));

        System.out.println("Строка просле преобразования: "
                + stringTransform.transform(str -> str.toLowerCase(), "aBCdEfghKLmnpRstU"));

        System.out.println("Строка просле преобразования: "
                + stringTransform.transform(str -> str.intern(), "aBCdEfghKLmnpRstU"));

    }

    public String transform(Function<String, String> fun, String s) {
        return fun.apply(s);
    }

}
