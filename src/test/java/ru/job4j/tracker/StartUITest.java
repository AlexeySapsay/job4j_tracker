package ru.job4j.tracker;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {
    private static final String LN = System.lineSeparator();

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "Item name", "1"});
        MemTracker tracker = new MemTracker();
        //UserAction[] actions = {new CreateAction(out), new Exit()};
        List<UserAction> actions = Arrays.asList(new CreateAction(out), new ExitAction());
        new StartUI(out).init(in, tracker, actions);
        //assertThat(tracker.findAll()[0].getName(), is("Item name"));
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
        //UserAction[] actions = {new ReplaceAction(out), new Exit()};
        List<UserAction> actions = Arrays.asList(new ReplaceAction(out), new ExitAction());
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
        //UserAction[] actions = {new DeleteAction(out), new Exit()};
        List<UserAction> actions = Arrays.asList(new DeleteAction(out), new ExitAction());
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
        //UserAction[] actions = {new ShowItemAction(out), new Exit()};
        List<UserAction> actions = Arrays.asList(new FindAllAction(out), new ExitAction());
        new StartUI(out).init(in, tracker, actions);

        assertThat(out.toString(), is("Menu." + LN + "0 . Show "
                + LN + "1 . Exit" + LN + " === Show all items === "
                + LN + "Item{id=1, name='Item1', created: 09-10-2021 02:29:59}" + LN
                + "Item{id=2, name='Item2',created: 09-10-2021 02:29:59}"
                + LN + "Menu." + LN + "0 . Show " + LN + "1 . Exit" + LN + ""));
    }

    @Test
    public void whenFindByIdAction() {
        Item item = new Item("Item");
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "1", "1"});
        MemTracker tracker = new MemTracker();
        tracker.add(item);

        //UserAction[] actions = {new FindByIdAction(out), new Exit()};
        List<UserAction> actions = Arrays.asList(new FindByIdAction(out), new ExitAction());
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
        //UserAction[] actions = {new FindByNameAction(out), new Exit()};
        List<UserAction> actions = Arrays.asList(new FindByNameAction(out), new ExitAction());

        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + LN + "0 . Find item by Name"
                + LN + "1 . Exit" + LN + " === Find item by Name === " + LN
                + "Item{id=1, name='Item'}" + LN + "Menu." + LN
                + "0 . Find item by Name" + LN + "1 . Exit" + LN));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0"});
        MemTracker tracker = new MemTracker();
        //UserAction[] actions = {new Exit()};
        List<UserAction> actions = Arrays.asList(new ExitAction());
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + LN
                + "0 . Exit" + LN));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"8", "0"});
        MemTracker tracker = new MemTracker();

        //UserAction[] actions = {new Exit()};
        List<UserAction> actions = Arrays.asList(new ExitAction());

        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(String.format("Menu.%n"
                + "0 . Exit%n"
                + "Wrong input, you can select: 0 .. 0%n"
                + "Menu.%n"
                + "0 . Exit%n"
        )));
    }
}