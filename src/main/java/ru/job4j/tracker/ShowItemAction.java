package ru.job4j.tracker;

public class ShowItemAction implements UserAction{
    private final Output out;

    public ShowItemAction (Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return " Show ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println(" === Show all items === ");
        Item[] itemsArray = tracker.findAll();
        for (Item elements : itemsArray) {
            out.println(elements);
        }
        return true;
    }
}
