package ru.job4j.oop;

/**
 * https://job4j.ru/profile/exercise/20/task-view/801
 * Изучение работы со статик методами
 *
 * @author AlexSapsay (sapsayalexey@gmail.com)
 * @version 1.0
 * @since 12.11.2021
 */

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public double divide(int a) {
        return a / x;
    }

    public double sumAllOperation(int a) {
        return sum(a) + minus(a) + multiply(a) + divide(a);
    }

    public static void main(String[] args) {
        int result1 = sum(10);
        System.out.println("Sum : " + result1);

        int result2 = minus(10);
        System.out.println("Minus : " + result2);

        Calculator calculator = new Calculator();
        int rsl3 = calculator.multiply(10);
        System.out.println("Multiply : " + rsl3);

        double rsl4 = calculator.divide(10);
        System.out.println("Divide : " + rsl4);

        double rsl5 = calculator.sumAllOperation(10);
        System.out.println("sumAllOperation : " + rsl5);
    }
}
