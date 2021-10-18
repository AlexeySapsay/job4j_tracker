package ru.job4j.collection;

/*https://job4j.ru/edu/task?action=task&taskId=0873958f758d0d5301758d8a572a2e4a&number=402115*/

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SortJobByPriorityAndAscendingTest {
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
    public void whenSortByPriorityAndAcending() {
        List<Job> jobs = Arrays.asList(
                new Job("X task", 0),
                new Job("Fix bugs", 1),
                new Job("Fix bug", 4),
                new Job("Add bug", 2),
                new Job("Add bugs", 3),
                new Job("Dance", 5)
        );

        Collections.sort(jobs, new SortJobByPriorityAndAscending());

        List<Job> sortedJobs = Arrays.asList(
                new Job("X task", 0),
                new Job("Fix bugs", 1),
                new Job("Add bug", 2),
                new Job("Add bugs", 3),
                new Job("Fix bug", 4),
                new Job("Dance", 5)
        );

        assertThat("Test is falure", sortedJobs, is(jobs));
    }
}