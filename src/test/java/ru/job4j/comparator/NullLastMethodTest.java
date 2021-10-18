package ru.job4j.comparator;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class NullLastMethodTest {
    @Test
    public void test() {
        List<String> list = Arrays.asList("3", "1", "2", null);
        list.sort(NullLastMethod.nullLast());
        assertEquals(Arrays.asList("1", "2", "3", null), list);
    }
}