package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.*;

public class JobSorterComplexComparatorTest {
    @Test
    public void whenJobsIsExist() {
        List<Job> jobs = List.of(
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
    public void whenSortByNameAndAscendingAndPriorityAscending() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("Fix bug", 3),
                new Job("X task", 0)
        );

        /*создаем кобинированный компаратор
        name ascending and priority ascending*/
        Comparator<Job> comb1 = new SortJobByNameAndAscending()
                .thenComparing(new SortJobByPriorityAndAscending());
        jobs.sort(comb1);

        List<Job> sortedJobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 2),
                new Job("Fix bug", 3),
                new Job("Fix bug", 4),
                new Job("X task", 0)
        );
        assertThat("failure - jobs is not sorted by comparator!", sortedJobs, is(jobs));
    }

    @Test
    public void whenNameAscendingAndPriorityDescending() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("Fix bug", 3),
                new Job("X task", 0)
        );

        /*создаем кобинированный компаратор name ascending and priority descending*/
        Comparator<Job> comb2 = new SortJobByNameAndAscending()
                .thenComparing(new SortJobByPriorityAndDescending());
        jobs.sort(comb2);

        List<Job> sortedJobs = Arrays.asList(
                new Job("Fix bug", 4),
                new Job("Fix bug", 3),
                new Job("Fix bug", 2),
                new Job("Fix bug", 1),
                new Job("X task", 0)
        );
        assertThat("failure - jobs is not sorted by comparator!", sortedJobs, is(jobs));
    }

    @Test
    public void nameDescendingAndPriorityAscending() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("Fix bug", 3),
                new Job("X task", 0)
        );

        /*создаем кобинированный компаратор name descending  and priority ascending*/
        Comparator<Job> comb3 = new SortJobByNameAndDescending()
                .thenComparing(new SortJobByPriorityAndAscending());
        jobs.sort(comb3);

        List<Job> sortedJobs = Arrays.asList(
                new Job("X task", 0),
                new Job("Fix bug", 1),
                new Job("Fix bug", 2),
                new Job("Fix bug", 3),
                new Job("Fix bug", 4)
        );
        assertThat("failure - jobs is not sorted by comparator!", sortedJobs, is(jobs));
    }

    @Test
    public void nameDescendingAndPriorityDescending() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("Fix bug", 3),
                new Job("X task", 0)
        );

        /*создаем кобинированный компаратор  name descending  and priority ascending*/
        Comparator<Job> comb4 = new SortJobByNameAndDescending()
                .thenComparing(new SortJobByPriorityAndDescending());
        jobs.sort(comb4);
        System.out.println(jobs);

        List<Job> sortedJobs = Arrays.asList(
                new Job("X task", 0),
                new Job("Fix bug", 4),
                new Job("Fix bug", 3),
                new Job("Fix bug", 2),
                new Job("Fix bug", 1)
        );
        assertThat("failure - jobs is not sorted by comparator!", sortedJobs, is(jobs));
    }
}