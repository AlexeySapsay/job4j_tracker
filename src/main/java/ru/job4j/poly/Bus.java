package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("moving forward!");
    }

    @Override
    public void passenger(int numberOfPassengers) {
        System.out.println("В автобусе находится " + numberOfPassengers);
    }

    @Override
    public float loadingFuel(float volume) {
        System.out.println("Вы купите " + volume + "литров топлива за " + volume * 100 + "рублей!");
        return volume * 100;
    }
}
