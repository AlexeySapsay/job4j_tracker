package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.model.Item;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem1() {
        MemTracker tracker = new MemTracker();
        Item item = new Item();
        item.setName("test1");
        tracker.add(item);
        Item result = tracker.findAll().get(0);
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenAddNewItemThenTrackerHasSameItemByFindById() {
        MemTracker tracker = new MemTracker();
        Item item = new Item();
        item.setName("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplace() {
        MemTracker tracker = new MemTracker();
        Item bug = new Item();
        bug.setName("Bug");
        tracker.add(bug);
        int id = bug.getId();
        Item bugWithDesc = new Item();
        bugWithDesc.setName("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        MemTracker tracker = new MemTracker();
        Item bug = new Item();
        bug.setName("Bug");
        tracker.add(bug);
        int id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }

    @Test
    public void whenDeleteTwoElements() {
        MemTracker tracker = new MemTracker();

        Item bug1 = new Item();
        bug1.setName("Bug1");
        tracker.add(bug1);
        int id1 = bug1.getId();
        tracker.delete(id1);

        Item bug2 = new Item();
        bug2.setName("Bug2");
        tracker.add(bug2);
        int id2 = bug2.getId();
        tracker.delete(id2);

        assertThat(tracker.findById(id1), is(nullValue()));
        assertThat(tracker.findById(id2), is(nullValue()));
    }
}