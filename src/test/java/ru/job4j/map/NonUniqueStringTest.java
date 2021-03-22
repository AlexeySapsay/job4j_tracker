package ru.job4j.map;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Map;

import static org.hamcrest.core.Is.is;


public class NonUniqueStringTest {
    @Test
    public void checkData() {
        String[] data = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> rsl = NonUniqueString.checkData(data);
        Map<String, Boolean> expected = Map.of("a", true, "b", true, "c", false);
        assertThat(rsl, is(expected));
    }

    @Test
    public void checkData2() {
        String[] data = {"a", "a", "a", "a", "b", "a", "c", "b"};
        Map<String, Boolean> rsl = NonUniqueString.checkData(data);
        Map<String, Boolean> expected = Map.of("a", true, "b", true, "c", false);
        assertThat(rsl, is(expected));
    }

    @Test
    public void checkData3() {
        String[] data = {};
        Map<String, Boolean> rsl = NonUniqueString.checkData(data);
        Map<String, Boolean> expected = Map.of();
        assertThat(rsl, is(expected));
    }

    @Test
    public void checkData4() {
        String[] data = {"a"};
        Map<String, Boolean> rsl = NonUniqueString.checkData(data);
        Map<String, Boolean> expected = Map.of("a",false);
        assertThat(rsl, is(expected));
    }
}