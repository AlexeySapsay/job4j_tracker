package ru.job4j.oop;

public class Student {
    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();

        petya.song();
        petya.song();
        petya.song();
    }

    public void music() {
        System.out.println(" Tra ra ra raaaaaa!");
    }

    public void song() {
        System.out.println("I belive I can fly! ");
        System.out.println("I belive I can touch the sky!");
    }

}
