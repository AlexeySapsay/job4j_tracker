package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return " === Find item by Name === ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr(" Введите имя для поиске в списке заявок "
                + " Enter name : ");
        Item[] itemArray = tracker.findByName(name);
        if (itemArray.length == 0) {
            System.out.println("Заявки с таким именем не найдены");
        } else {
            for (Item element : itemArray) {
                System.out.println(element);
            }
        }
        return true;
    }
}
