package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import java.util.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class SortJobByNameAndAscendingTest {
    @Test
    public void whenJobsIsExist() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("Fix bug", 3),
                new Job("X task", 0)
        );

        Iterator<Job> iterator = jobs.iterator();

        assertThat(iterator.next(), is(new Job("Fix bug", 1)));
        assertThat(iterator.next(), is(new Job("Fix bug", 4)));
        assertThat(iterator.next(), is(new Job("Fix bug", 2)));
        assertThat(iterator.next(), is(new Job("Fix bug", 3)));
        assertThat(iterator.next(), is(new Job("X task", 0)));
    }

    @Test
    public void whenSortByNameAndAcending() {
        List<Job> jobs = Arrays.asList(
                new Job("X task", 0),
                new Job("Fix bugs", 1),
                new Job("Fix bug", 4),
                new Job("Add bug", 2),
                new Job("Add bugs", 3),
                new Job("Dance", 5)
        );

        Collections.sort(jobs, new SortJobByNameAndAscending());

        List<Job> sortedJobs = Arrays.asList(
                new Job("Add bug", 2),
                new Job("Add bugs", 3),
                new Job("Dance", 5),
                new Job("Fix bug", 4),
                new Job("Fix bugs", 1),
                new Job("X task", 0)
        );
        assertThat("failure - jobs is not sorted by comparator!", sortedJobs, is(jobs));
    }
}