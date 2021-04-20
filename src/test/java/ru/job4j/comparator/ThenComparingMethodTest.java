package ru.job4j.comparator;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ThenComparingMethodTest {
    @Test
    public void thenThemComparingMethod() {
        ThenComparingMethod.User user1 = new ThenComparingMethod.User("C", 10);
        ThenComparingMethod.User user2 = new ThenComparingMethod.User("B", 20);
        ThenComparingMethod.User user3 = new ThenComparingMethod.User("A", 15);
        ThenComparingMethod.User user4 = new ThenComparingMethod.User("B", 11);
        ThenComparingMethod.User user5 = new ThenComparingMethod.User("A", 12);

        List<ThenComparingMethod.User> input = Arrays.asList(user1, user2, user3, user4, user5);
        List<ThenComparingMethod.User> expect = Arrays.asList(user3, user5, user2, user4, user1);
        input.sort(ThenComparingMethod.thenComparing());
        assertEquals(expect, input);
    }

    //  сортируем имена по возрастанию
    @Test
    public void ascByNameTest() {
        ThenComparingMethod.User user1 = new ThenComparingMethod.User("C", 10);
        ThenComparingMethod.User user2 = new ThenComparingMethod.User("B", 20);
        ThenComparingMethod.User user3 = new ThenComparingMethod.User("A", 15);
        ThenComparingMethod.User user4 = new ThenComparingMethod.User("B", 11);
        ThenComparingMethod.User user5 = new ThenComparingMethod.User("A", 12);

        List<ThenComparingMethod.User> input = Arrays.asList(user1, user2, user3, user4, user5);
        //List<ThenComparingMethod.User> expect = Arrays.asList(user3, user5, user2, user4, user1);
        List<ThenComparingMethod.User> expect = Arrays.asList(user3, user5, user2, user4, user1);
        input.sort(ThenComparingMethod.ascByName());
        assertEquals(expect, input);
    }

    // сортируем по возрастанию Age
    @Test
    public void ascByAgeTest() {
        ThenComparingMethod.User user1 = new ThenComparingMethod.User("C", 10);
        ThenComparingMethod.User user2 = new ThenComparingMethod.User("B", 20);
        ThenComparingMethod.User user3 = new ThenComparingMethod.User("A", 15);
        ThenComparingMethod.User user4 = new ThenComparingMethod.User("B", 11);
        ThenComparingMethod.User user5 = new ThenComparingMethod.User("A", 12);

        List<ThenComparingMethod.User> input = Arrays.asList(user1, user2, user3, user4, user5);
        //List<ThenComparingMethod.User> expect = Arrays.asList(user3, user5, user2, user4, user1);
        List<ThenComparingMethod.User> expect = Arrays.asList(user1, user4, user5, user3, user2);
        input.sort(ThenComparingMethod.ascByAge());
        assertEquals(expect, input);
    }

    //  сортируем имена по убыванию Age
    @Test
    public void descByAgeTest() {
        ThenComparingMethod.User user1 = new ThenComparingMethod.User("C", 10);
        ThenComparingMethod.User user2 = new ThenComparingMethod.User("B", 20);
        ThenComparingMethod.User user3 = new ThenComparingMethod.User("A", 15);
        ThenComparingMethod.User user4 = new ThenComparingMethod.User("B", 11);
        ThenComparingMethod.User user5 = new ThenComparingMethod.User("A", 12);

        List<ThenComparingMethod.User> input = Arrays.asList(user1, user2, user3, user4, user5);
        //List<ThenComparingMethod.User> expect = Arrays.asList(user3, user5, user2, user4, user1);
        List<ThenComparingMethod.User> expect = Arrays.asList(user1, user2, user4, user3, user5);
        input.sort(ThenComparingMethod.descByName());
        assertEquals(expect, input);
    }

    //sort by ascendingName and ascending age
    @Test
    public void ascNameAscAgeTest() {
        ThenComparingMethod.User user1 = new ThenComparingMethod.User("C", 10);
        ThenComparingMethod.User user2 = new ThenComparingMethod.User("B", 20);
        ThenComparingMethod.User user3 = new ThenComparingMethod.User("A", 15);
        ThenComparingMethod.User user4 = new ThenComparingMethod.User("B", 11);
        ThenComparingMethod.User user5 = new ThenComparingMethod.User("A", 12);

        List<ThenComparingMethod.User> input = Arrays.asList(user1, user2, user3, user4, user5);
        List<ThenComparingMethod.User> expect = Arrays.asList(user5, user3, user4, user2, user1);
        input.sort(ThenComparingMethod.ascByName().
                thenComparing(ThenComparingMethod.ascByAge()));
        assertEquals(expect, input);
    }

    // sort ascName and descAge
    @Test
    public void ascNameDescAgeTest() {
        ThenComparingMethod.User user1 = new ThenComparingMethod.User("C", 10);
        ThenComparingMethod.User user2 = new ThenComparingMethod.User("B", 20);
        ThenComparingMethod.User user3 = new ThenComparingMethod.User("A", 15);
        ThenComparingMethod.User user4 = new ThenComparingMethod.User("B", 11);
        ThenComparingMethod.User user5 = new ThenComparingMethod.User("A", 12);

        List<ThenComparingMethod.User> input = Arrays.asList(user1, user2, user3, user4, user5);
        List<ThenComparingMethod.User> expect = Arrays.asList(user3, user5, user2, user4, user1);
        input.sort(ThenComparingMethod.ascByName().
                thenComparing(ThenComparingMethod.descByAge()));
        assertEquals(expect, input);
    }

    // sort descName and ascAge
    @Test
    public void descNameAscAgeTest() {
        ThenComparingMethod.User user1 = new ThenComparingMethod.User("C", 10);
        ThenComparingMethod.User user2 = new ThenComparingMethod.User("B", 20);
        ThenComparingMethod.User user3 = new ThenComparingMethod.User("A", 15);
        ThenComparingMethod.User user4 = new ThenComparingMethod.User("B", 11);
        ThenComparingMethod.User user5 = new ThenComparingMethod.User("A", 12);

        List<ThenComparingMethod.User> input = Arrays.asList(user1, user2, user3, user4, user5);
        List<ThenComparingMethod.User> expect = Arrays.asList(user1, user4, user2, user5, user3);
        input.sort(ThenComparingMethod.descByName().
                thenComparing(ThenComparingMethod.ascByAge()));
        assertEquals(expect, input);
    }
}