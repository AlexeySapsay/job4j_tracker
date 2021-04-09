package ru.job4j.poly;

public interface Transport {
    void move();

    void passenger(int numberOfPassengers);

    float loadingFuel(float volume);
}
