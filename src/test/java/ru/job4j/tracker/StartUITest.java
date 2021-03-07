package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {
//    private static final String LN = System.lineSeparator();
//
//    @Test
//    public void whenCreateItem() {
//        Output out = new StubOutput();
//        Input in = new StubInput(new String[]{"0", "Item name", "1"});
//        Tracker tracker = new Tracker();
//        UserAction[] actions = {new CreateAction(out), new Exit()};
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(tracker.findAll()[0].getName(), is("Item name"));
//    }
//
//    @Test
//    public void whenReplaceItem() {
//        Output out = new StubOutput();
//        Tracker tracker = new Tracker();
//        Item item = tracker.add(new Item("Replace item"));
//        /* Входные данные должны содержать ID добавленной заявки item.getId() */
//        String replaceName = "New item name";
//        Input in = new StubInput(new String[]{"0", "1", "New item name", "1"});
//        UserAction[] actions = {new ReplaceAction(out), new Exit()};
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(tracker.findById(item.getId()).getName(), is(replaceName));
//    }
//
//    @Test
//    public void whenDeleteItem() {
//        Output out = new StubOutput();
//        Tracker tracker = new Tracker();
//        Item item = tracker.add(new Item("Delete item"));
//        /* Входные данные должны содержать ID добавленной заявки item.getId() */
//        Input in = new StubInput(new String[]{"0", "1", "1"});
//        UserAction[] actions = {new DeleteAction(out), new Exit()};
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(tracker.findById(item.getId()), is(nullValue()));
//    }
//
//    @Test
//    public void whenShowItemAction() {
//        Output out = new StubOutput();
//        Tracker tracker = new Tracker();
//        Item item1 = tracker.add(new Item("Item1"));
//        Item item2 = tracker.add(new Item("Item2"));
//
//        Input in = new StubInput(new String[]{"0", "1"});
//        UserAction[] actions = {new ShowItemAction(out), new Exit()};
//        new StartUI(out).init(in, tracker, actions);
//
//        assertThat(out.toString(), is("Menu." + LN + "0 . Show "
//                + LN + "1 . Exit" + LN + " === Show all items === "
//                + LN + "Item{id=1, name='Item1'}" + LN + "Item{id=2, name='Item2'}"
//                + LN + "Menu." + LN + "0 . Show " + LN + "1 . Exit" + LN + ""));
//    }
//
//    @Test
//    public void whenFindByIdAction() {
//        Item item = new Item("Item");
//        Output out = new StubOutput();
//        Input in = new StubInput(new String[]{"0", "1", "1"});
//        Tracker tracker = new Tracker();
//        tracker.add(item);
//        UserAction[] actions = {new FindByIdAction(out), new Exit()};
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(out.toString(), is("Menu." + LN + "0 . Find item by Id"
//                + LN + "1 . Exit" + LN + " === Find item by Id === "
//                + LN + "Item" + LN + "Menu." + LN
//                + "0 . Find item by Id" + LN + "1 . Exit" + LN));
//    }
//
//    @Test
//    public void whenFindByNameAction() {
//        Item item = new Item("Item");
//        Output out = new StubOutput();
//        Input in = new StubInput(new String[]{"0", "Item", "1"});
//        Tracker tracker = new Tracker();
//        tracker.add(item);
//        UserAction[] actions = {new FindByNameAction(out), new Exit()};
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(out.toString(), is("Menu." + LN + "0 . Find item by Name"
//                + LN + "1 . Exit" + LN + " === Find item by Name === " + LN
//                + "Item{id=1, name='Item'}" + LN + "Menu." + LN
//                + "0 . Find item by Name" + LN + "1 . Exit" + LN));
//    }
//
//    @Test
//    public void whenExit() {
//        Output out = new StubOutput();
//        Input in = new StubInput(new String[]{"0"});
//        Tracker tracker = new Tracker();
//        UserAction[] actions = {new Exit()};
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(out.toString(), is("Menu." + LN +
//                "0 . Exit" + LN));
//    }
//
//    @Test
//    public void whenInvalidExit() {
//        Output out = new StubOutput();
//        Input in = new StubInput(new String[]{"8", "0"});
//        Tracker tracker = new Tracker();
//        UserAction[] actions = {new Exit()};
//
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(out.toString(), is(String.format("Menu.%n"
//                +"0 . Exit%n"
//                +"Wrong input, you can select: 0 .. 0%n"
//                +"Menu.%n"
//                +"0 . Exit%n"
//        )));
//    }
}