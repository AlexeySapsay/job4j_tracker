package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenSplittingWithoutGaps() {
        List<String> input = Arrays.asList("k1/sk1");
        List<String> expect = Arrays.asList("/k1", "/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSplittingAndHierarchyWithoutGaps() {
        List<String> input = Arrays.asList("k1/sk1", "k1/sk2");
        List<String> expect = Arrays.asList("/k1", "/sk1", "/sk2");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }
}