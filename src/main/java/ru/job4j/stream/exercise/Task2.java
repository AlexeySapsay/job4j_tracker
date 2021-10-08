package ru.job4j.stream.exercise;

import java.util.List;
import java.util.stream.Collectors;

/**
 *https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html
 */

public class Task2 {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alex", "Stanslavskogo107/19"),
                new Person("Youra", "Zapadniy100"),
                new Person("Sania", "Center300"));
        List<String> peopleName = people.stream()
                .map(Person::getName).collect(Collectors.toList());
        System.out.println(peopleName);

        List<String> peopleAdress = people.stream()
                .map(Person::getAdress).collect(Collectors.toList());
        System.out.println(peopleAdress);
    }

    public static class Person {
        private String name;
        private String adress;

        Person(String name, String adress) {
            this.name = name;
            this.adress = adress;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAdress() {
            return adress;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }

        @Override
        public String toString() {
            return "Person{"
                    + "name='" + name + '\''
                    + ", adress='" + adress + '\''
                    + '}';
        }
    }
}
