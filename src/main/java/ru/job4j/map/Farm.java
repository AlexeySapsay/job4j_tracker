package ru.job4j.map;

import java.util.Map;
import java.util.Objects;
import java.util.HashMap;

public class Farm {
    public static void main(String[] args) {
        Map<Animal, Integer> mapForTest = new HashMap<Animal, Integer>();
        mapForTest.put(new Animal("Chicken", 2), 11);
        mapForTest.put(new Animal("Pig", 4), 10);

        System.out.println(sumLegs(mapForTest));
    }

    public static int sumLegs(Map<Animal, Integer> data) {
        int sumLegs = 0;
        for (Map.Entry<Animal, Integer> entry : data.entrySet()) {
            sumLegs += entry.getKey().getLeg() * entry.getValue();
        }

        return sumLegs;
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

        public int getLeg() {
            return legs;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Animal animal = (Animal) o;
            return Objects.equals(name, animal.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
