package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev",
                "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenFindSurName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev",
                "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("Arsentev");
        assertThat(persons.get(0).getName(), is("Petr"));
    }

    @Test
    public void whenFindPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev",
                "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("534872");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenFindAdress() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev",
                "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("Bryansk");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}