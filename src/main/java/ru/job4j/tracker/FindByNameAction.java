package ru.job4j.tracker;

import ru.job4j.tracker.model.Item;

import java.util.List;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by Name";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        out.println(" === Find item by Name === ");
        String name = input.askStr(" Введите имя для поиске в списке заявок "
                + " Enter name : ");
        List<Item> itemArray = tracker.findByName(name);
        if (itemArray.size() == 0) {
            out.println("Заявки с таким именем не найдены");
        } else {
            for (Item element : itemArray) {
                out.println(element);
            }
        }
        return true;
    }
}
