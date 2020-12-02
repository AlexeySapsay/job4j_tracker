package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matches = 11;

        while (matches > 0) {
            System.out.println("Первый игрок берет от 1 до 3 спичек :");
            int firstPlayer = Integer.parseInt(scanner.nextLine());
            matches -= firstPlayer;
            System.out.println("На столе осталось : " + matches + " спичек.");

            if (matches <= 0) {
                System.out.println("Первый игрок победил! Ура!!!");
                break;
            }

            System.out.println("Второй игрок берет от 1 до 3 спичек :");
            int secondPlayer = Integer.parseInt(scanner.nextLine());
            matches -= secondPlayer;
            System.out.println("На столе осталось : " + matches);

            if (matches <= 0) {
                System.out.println("Второй игрок победил! Ура!!!");
                break;
            }
        }
    }
}
