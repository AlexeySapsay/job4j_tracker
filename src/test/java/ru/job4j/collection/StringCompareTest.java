package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StringCompareTest {
    @Test
    public void whenStringAreEqualsThanZero() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(rsl, is(0));
    }

    @Test
    public void whenLeftLessThanRightResultShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(rst, lessThan(0));
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Petrov",
                "Ivanova"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Patrova",
                "Petrov");
        assertThat(rst, lessThan(0));
    }


    @Test
    public void whenLeftAndRightIsPalindromm() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Banan",
                "Nanab");
        assertThat(rst, lessThan(0));
    }


    @Test
    public void whenStringIsEmptyThenBeSero() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare("", "");
        assertThat(rsl, is(0));
    }


    @Test
    public void whenCompareNonEmptyWithEmptyStringShouldBeNagatie() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare("", "Ivanov");
        assertThat(rsl, lessThan(0));
    }
}