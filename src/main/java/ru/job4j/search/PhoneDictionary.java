package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> predName = (key1) -> key1.getName().equals(key);
        Predicate<Person> predSurname = (key2) -> key2.getSurname().equals(key);
        Predicate<Person> predAddress = (key3) -> key3.getAddress().equals(key);
        Predicate<Person> predPhone = (key4) -> key4.getPhone().equals(key);

        Predicate<Person> combine = predName.or(predSurname).
                or(predAddress).or(predPhone);

        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
