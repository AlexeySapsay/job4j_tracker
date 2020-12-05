package ru.job4j.oop;

public class Bus implements Vehicle{
    @Override
    public void move() {
        System.out.println("Автомобиль двигается на автопилоте по скоростным трассам");
    }

    @Override
    public void sound() {
        System.out.println("Издает звук гоночного автомобиля!");
    }
}
