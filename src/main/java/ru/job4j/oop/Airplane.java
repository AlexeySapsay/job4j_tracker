package ru.job4j.oop;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолет летает по воздуху");
    }

    @Override
    public void sound() {
        System.out.println("издает громкий звук летящего самолета");
    }
}
