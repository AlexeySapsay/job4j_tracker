package ru.job4j.tracker;

public class ShowItem implements UserAction{
    @Override
    public String name() {
        return " === Show all items === ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        //String name = input.askStr("Enter name : ");
        Item[] itemsArray = tracker.findAll();
        for (Item elements : itemsArray) {
            System.out.println(elements);
        }
        return true;
    }
}
