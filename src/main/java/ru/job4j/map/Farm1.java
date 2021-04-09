package ru.job4j.map;

import java.util.Map;
import java.util.Objects;

public class Farm1 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("chiken", 2);

        System.out.println(animal1.getLegs() + " legs has " + animal1.getName());
    }

    public static class Animal {
        private String name;
        private int legs;

        public Animal(String name, int legs) {
            this.name = name;
            this.legs = legs;
        }

        public String getName() {
            return name;
        }

        public int getLegs() {
            return legs;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Animal animal = (Animal) o;
            return Objects.equals(name, animal.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
