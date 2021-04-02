package ru.job4j.collection;

//https://job4j.ru/edu/task?action=task&taskId=0873958f758d0d5301758d8a572a2e4a&number=402115

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.*;

public class SortJobByPriorityAndDescendingTest {
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
    public void wheSortByPriorityAndDecending() {
        List<Job> jobs = Arrays.asList(
                new Job("X task", 0),
                new Job("Fix bugs", 1),
                new Job("Fix bug", 4),
                new Job("Add bug", 2),
                new Job("Add bugs", 3),
                new Job("Dance", 5)
        );

        Collections.sort(jobs, new SortJobByPriorityAndDescending());

        List<Job> sortedJobs = Arrays.asList(
                new Job("Dance", 5),
                new Job("Fix bug", 4),
                new Job("Add bugs", 3),
                new Job("Add bug", 2),
                new Job("Fix bugs", 1),
                new Job("X task", 0)
        );

        assertThat("Test is failure!", sortedJobs, is(jobs));
    }
}