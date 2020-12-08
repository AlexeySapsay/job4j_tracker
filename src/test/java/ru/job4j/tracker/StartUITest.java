package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "Item name", "1"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(out), new Exit()};
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replace item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        String replaceName = "New item name";
        Input in = new StubInput(new String[]{"0", "1", "New item name", "1"});
        UserAction[] actions = {new ReplaceAction(out), new Exit()};
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replaceName));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Delete item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        Input in = new StubInput(new String[]{"0", "1", "1"});
        UserAction[] actions = {new DeleteAction(out), new Exit()};
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenShowItemAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("Item1"));
        Item item2 = tracker.add(new Item("Item2"));

        Input in = new StubInput(new String[]{"0", "1"});
        UserAction[] actions = {new ShowItemAction(out), new Exit()};
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu.\r\n0 .  Show \r\n1 . Exit\r\n " +
                "=== Show all items === \r\nMenu.\r\n0 .  Show \r\n1 . Exit\r\n"));
    }

    @Test
    public void whenFindByIdAction() {
        Item item = new Item("Item");
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "1", "1"});
        Tracker tracker = new Tracker();
        tracker.add(item);
        UserAction[] actions = {new FindByIdAction(out), new Exit()};
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu.\r\n0 .  Find item by Id\r\n1 . Exit\r\n === Find item by Id === \r\nMenu.\r\n0 .  Find item by Id\r\n1 . Exit\r\n"));
    }

    @Test
    public void whenFindByNameAction() {
        Item item = new Item("Item");
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0","Item","1"});
        Tracker tracker = new Tracker();
        tracker.add(item);
        UserAction[] actions = {new FindByNameAction(out), new Exit()};
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu.\r\n0 . Find item by Name\r\n1 " +
                ". Exit\r\n === Find item by Name === \r\nMenu.\r\n0 " +
                ". Find item by Name\r\n1 . Exit\r\n"));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new Exit()};
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator() +
                "0 . Exit" + System.lineSeparator()));
    }
}