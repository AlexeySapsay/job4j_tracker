package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Поезд передвигается по рельсам");
    }

    @Override
    public void sound() {
        System.out.println("Издает громкий звук приближающего поезда");
    }
}
