package ru.job4j.tracker.action;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Output;
import ru.job4j.tracker.Store;
import ru.job4j.tracker.model.Item;

public class Replace implements UserAction {
    private final Output out;

    public Replace(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Update";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        int id = Integer.parseInt(input.askStr("Enter item id for update : "));
        String name = input.askStr("Enter a new name of item : ");
        Item item = new Item(name);
        item.setId(id);

        /*2. Для методов replace/delete сделать вывод в виде:*/
        if (tracker.replace(id, item)) {
            /*вывод об успешности операции*/
            out.println("замена элемента по id выполненна успешно");
        } else {
            /*вывод об ошибке*/
            out.println("возникла ошибка при попытке замены элемента"
                    + "возможно элемента с таким id не существует"
                    + "попробуйте снова");
        }
        return true;
    }
}
