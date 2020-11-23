package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        another.load = + this.load + another.load ;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(1);
        Battery second = new Battery(2);
        Battery third = new Battery(10);
        Battery fourth = new Battery(15);
        Battery fifth = new Battery(-1);
        Battery sixth = new Battery(12);
        Battery seventh = new Battery(20);
        Battery eighth = new Battery(30);
        Battery ninth = new Battery(50);
        Battery tenth = new Battery(55);


        System.out.println("first : " + first.load + ". second : " + second.load + ". third : " + third.load);
        first.exchange(second);
        System.out.println("first : " + first.load + ". second : " + second.load + ". third : " + third.load);
        second.exchange(third);
        System.out.println("first : " + first.load + ". second : " + second.load + ". third : " + third.load);
        third.exchange(fourth);
        System.out.println("first : " + first.load + ". second : " + second.load + ". third : " + third.load + ". fourth : " + fourth.load);
        fourth.exchange(fifth);
        fifth.exchange(sixth);
        sixth.exchange(second);
        second.exchange(eighth);
        eighth.exchange(ninth);
        ninth.exchange(tenth);
        System.out.println("... ... ...");
        System.out.println("tenth : " + tenth.load);


    }
}
