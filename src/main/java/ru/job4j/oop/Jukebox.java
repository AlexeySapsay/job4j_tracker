package ru.job4j.oop;

public class Jukebox {
    public static void main(String[] args) {

    }

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        }
        if (position == 2) {
            System.out.println("Спокойной ночи");
        }
        System.out.println("Песня не найдена");
    }
}
