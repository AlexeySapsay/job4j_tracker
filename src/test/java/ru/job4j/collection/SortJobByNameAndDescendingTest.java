package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;

public class SortJobByNameAndDescendingTest {
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
    public void wheSortByNameAndDecending() {
        List<Job> jobs = Arrays.asList(
                new Job("X task", 0),
                new Job("Fix bugs", 1),
                new Job("Fix bug", 4),
                new Job("Add bug", 2),
                new Job("Add bugs", 3),
                new Job("Dance", 5)
        );

        Collections.sort(jobs, new SortJobByNameAndDescending());

        List<Job> sortedJobs = Arrays.asList(
                new Job("X task", 0),
                new Job("Fix bugs", 1),
                new Job("Fix bug", 4),
                new Job("Dance", 5),
                new Job("Add bugs", 3),
                new Job("Add bug", 2)
        );

        assertThat("Failure - jobs is not sorted by comparator!", sortedJobs, is(jobs));
    }
}