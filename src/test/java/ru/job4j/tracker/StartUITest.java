package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import ru.job4j.tracker.action.*;
import ru.job4j.tracker.model.Item;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class StartUITest {
    private static final String LN = System.lineSeparator();

    @Test
    public void whenAddItem() {
        String[] answers = {};
        Input input = new MockInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
    }

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "Item name", "1"});
        MemTracker tracker = new MemTracker();

        List<UserAction> actions = Arrays.asList(new Create(out), new Exit());
        new StartUI(out).init(in, tracker, actions);

        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        MemTracker tracker = new MemTracker();
        Item item = tracker.add(new Item("Replace item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        String replaceName = "New item name";
        Input in = new StubInput(new String[]{"0", "1", "New item name", "1"});

        List<UserAction> actions = Arrays.asList(new Replace(out), new Exit());
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replaceName));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        MemTracker tracker = new MemTracker();
        Item item = tracker.add(new Item("Delete item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        Input in = new StubInput(new String[]{"0", "1", "1"});

        List<UserAction> actions = Arrays.asList(new Delete(out), new Exit());
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenShowItemAction() {
        Output out = new StubOutput();
        MemTracker tracker = new MemTracker();
        Item item1 = tracker.add(new Item("Item1"));
        Item item2 = tracker.add(new Item("Item2"));

        Input in = new StubInput(new String[]{"0", "1"});
        List<UserAction> actions = Arrays.asList(new FindAll(out), new Exit());
        new StartUI(out).init(in, tracker, actions);

        LocalDateTime localDateTime1 = tracker.findById(1).getCreated();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime1 = localDateTime1.format(formatter1);

        LocalDateTime localDateTime2 = tracker.findById(1).getCreated();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime2 = localDateTime2.format(formatter2);

        assertThat(out.toString(), is("Menu." + LN + "0 . Show "
                + LN + "1 . Exit" + LN + " === Show all items === "
                + LN + "id: 1, name: Item1, created: " + formatDateTime1
                + LN + "id: 2, name: Item2, created: " + formatDateTime2
                + LN + "Menu." + LN + "0 . Show " + LN + "1 . Exit" + LN + ""));
    }

    @Test
    public void whenFindByIdAction() {
        Item item = new Item("Item");
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "1", "1"});
        MemTracker tracker = new MemTracker();
        tracker.add(item);

        List<UserAction> actions = Arrays.asList(new FindById(out), new Exit());
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + LN + "0 . Find item by Id"
                + LN + "1 . Exit" + LN + " === Find item by Id === "
                + LN + "Item" + LN + "Menu." + LN
                + "0 . Find item by Id" + LN + "1 . Exit" + LN));
    }

    @Test
    public void whenFindByNameAction() {
        Item item = new Item("Item");
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "Item", "1"});
        MemTracker tracker = new MemTracker();
        tracker.add(item);

        List<UserAction> actions = Arrays.asList(new FindByName(out), new Exit());
        new StartUI(out).init(in, tracker, actions);
        System.out.println(out.toString());

        LocalDateTime localDateTime = tracker.findById(1).getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = localDateTime.format(formatter);

        assertThat(out.toString(), is("Menu."
                + LN + "0 . Find item by Name"
                + LN + "1 . Exit" + LN + " === Find item by Name === "
                + LN + "id: 1, name: Item, created: " + formatDateTime
                + LN + "Menu."
                + LN + "0 . Find item by Name"
                + LN + "1 . Exit" + LN));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0"});
        MemTracker tracker = new MemTracker();

        List<UserAction> actions = Arrays.asList(new Exit());
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + LN
                + "0 . Exit" + LN));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"8", "0"});
        MemTracker tracker = new MemTracker();

        List<UserAction> actions = Arrays.asList(new Exit());

        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(String.format("Menu.%n"
                + "0 . Exit%n"
                + "Wrong input, you can select: 0 .. 0%n"
                + "Menu.%n"
                + "0 . Exit%n"
        )));
    }
}