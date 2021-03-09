package ru.job4j.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import static ru.job4j.map.ComputeIfAbsent.User;

public class ComputeIfAbsentTest {
    @Test
    public void collectData() {
        Map<Integer, String> names = new HashMap<>(Map.of(1, "", 2, ""));
        List<User> users = List.of(
                new User(1, "name1"),
                new User(2, "name2"),
                // new User(3, "name3"),

                new User(4, "name4"),
                new User(3, "name3"),
                new User(5,"name5"),
                new User(7,"name7"),
                new User(6,"name6")
                //new User(6, "name6")
        );
        Map<Integer, String> rsl = ComputeIfAbsent.collectData(names, users);
        Map<Integer, String> expected = Map.of(4, "name4", 1, "name1",
                2, "name2", 3, "name3",5,"name5",
                7,"name7", 6,"name6");
        assertThat(rsl, is(expected));
    }
}