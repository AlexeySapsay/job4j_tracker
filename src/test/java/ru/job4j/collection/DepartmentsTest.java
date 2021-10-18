package ru.job4j.collection;

import org.junit.Test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * https://job4j.ru/profile/exercise/32/task-view/235
 * Отсортировать департаменты
 *
 * @author AlexSapsay (sapsayalexey@gmail.com)
 * @version 1.0
 * @since 13.10.2021
 */

public class DepartmentsTest {

    @Test
    public void whenSplittingWithoutGaps() {
        List<String> input = Arrays.asList("k1/sk1");
        List<String> expected = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenMissing2Gaps() {
        List<String> input = Arrays.asList("k1/sk1", "k2/sk1/ssk2");
        List<String> expect = Arrays.asList("k1", "k1/sk1", "k2", "k2/sk1", "k2/sk1/ssk2");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenWithoutChanging() {
        List<String> input = Arrays.asList("k1/sk1", "k1/sk2");
        List<String> expect = Arrays.asList("k1", "k1/sk1", "k1/sk2");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenAscSort() {
        List<String> input = Arrays.asList("k2", "k1/sk1/ssk1", "k2/sk1", "k1/sk1", "k2/sk2", "k1");
        List<String> expect =
                Arrays.asList("k1", "k1/sk1", "k1/sk1/ssk1", "k2", "k2/sk1", "k2/sk2");
        List<String> result = Departments.fillGaps(input);
        Departments.sortAsc(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortDescAndFillGaps() {
        List<String> input = Arrays.asList("k2/sk1", "k1/sk2");
        List<String> expected = Arrays.asList("k2", "k2/sk1", "k1", "k1/sk2");
        List<String> result = Departments.fillGaps(input);
        Departments.sortDesc(result);
        assertThat(result, is(expected));
    }
}