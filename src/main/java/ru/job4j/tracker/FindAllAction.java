package ru.job4j.tracker;
import ru.job4j.tracker.model.Item;

import java.util.List;

public class FindAllAction implements UserAction {
    private final Output out;

    public FindAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show ";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        out.println(" === Show all items === ");
        List<Item> itemsArray = tracker.findAll();
        for (Item elements : itemsArray) {
            out.println(elements);
        }
        return true;
    }
}
