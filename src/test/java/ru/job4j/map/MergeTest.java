package ru.job4j.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static ru.job4j.map.Merge.User;
import static org.hamcrest.MatcherAssert.assertThat;

public class MergeTest {

    @Test
    public void collectData() {
        Map<Integer, String> names = new HashMap<>(Map.of(1, "name1", 2, "name2"));
        List<User> users = List.of(
                new User(1, "name1", "surname1"),
                new User(2, "name2", "surname2"),
                new User(3, "name3", "surname3"),
                new User(4, "name4", "surname4")
        );

        Map<Integer, String> rsl = Merge.collectData(names, users);
        Map<Integer, String> expected = Map.of(
                1, "name1 surname1",
                2, "name2 surname2",
                3, "name3 surname3",
                4, "name4 surname4"
        );
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectData2() {
        Map<Integer, String> names = new HashMap<>(Map.of(1, "name1", 2, "name2", 3, "name3"));
        List<User> users = List.of(
                new User(1, "name1", "surname1"),
                new User(2, "name2", "surname2"),
                new User(3, "name3", "surname3"),
                new User(4, "name4", "surname4"),
                new User(5, "name5", "surname5"),
                new User(6, "name6", "surname6")
        );

        Map<Integer, String> rsl = Merge.collectData(names, users);
        Map<Integer, String> expected = Map.of(
                1, "name1 surname1",
                2, "name2 surname2",
                3, "name3 surname3",
                4, "name4 surname4",
                5, "name5 surname5",
                6, "name6 surname6"
        );
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectData3() {
        Map<Integer, String> names = new HashMap<>(Map.of(3, "name3"));
        List<User> users = List.of(
                new User(1, "name1", "surname1"),
                new User(2, "name2", "surname2"),
                new User(3, "name3", "surname3"),
                new User(5, "name5", "surname5"),
                new User(4, "name4", "surname4"),
                new User(6, "name6", "surname6")
        );

        Map<Integer, String> rsl = Merge.collectData(names, users);
        Map<Integer, String> expected = Map.of(
                1, "name1 surname1",
                2, "name2 surname2",
                3, "name3 surname3",
                4, "name4 surname4",
                5, "name5 surname5",
                6, "name6 surname6"
        );
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectData4() {
        Map<Integer, String> names = new HashMap<>(Map.of());
        List<User> users = List.of(
                new User(1, "name1", "surname1"),
                new User(2, "name2", "surname2"),
                new User(3, "name3", "surname3"),
                new User(5, "name5", "surname5"),
                new User(4, "name4", "surname4"),
                new User(6, "name6", "surname6")
        );

        Map<Integer, String> rsl = Merge.collectData(names, users);
        Map<Integer, String> expected = Map.of(
                1, "name1 surname1",
                2, "name2 surname2",
                3, "name3 surname3",
                4, "name4 surname4",
                5, "name5 surname5",
                6, "name6 surname6"
        );
        assertThat(rsl, is(expected));
    }
}