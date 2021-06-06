package ru.job4j.lambda;

import java.util.function.Supplier;

public class ScopeInside {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int total = 0;
        for (int num : number) {
            int buff = total;
            total = add(() -> buff + num);
        }
        System.out.println(total);
    }

    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    private static Integer add(Supplier<Integer> calc) {
        return calc.get();
    }
}
