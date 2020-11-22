package ru.job4j.oop;

public class Student {
    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I belive, I can fly.";
        petya.music(song);
        petya.music(song);
        petya.music(song);

        petya.song();
        petya.song();
        petya.song();
    }

    public void music(String innerVariable) {
        System.out.println("I can sign a song: " + innerVariable);
    }

    public void song() {
        System.out.println("I belive I can fly! ");
        System.out.println("I belive I can touch the sky!");
    }

}
