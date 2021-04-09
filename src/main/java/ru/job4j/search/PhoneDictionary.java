package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> person = new ArrayList<Person>();

    public void add(Person person) {
        this.person.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        //realise function
        for (Person personInstance : person) {
            if (personInstance.getPhone().equals(key)
                    || personInstance.getSurname().equals(key)
                    || personInstance.getAddress().equals(key)
                    || personInstance.getName().equals(key)) {
                result.add(personInstance);
            }
        }
        return result;
    }
}
