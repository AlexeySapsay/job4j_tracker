package ru.job4j.tracker.action;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Output;
import ru.job4j.tracker.Store;

public class Delete implements UserAction {
    private static String lN = System.lineSeparator();
    private final Output out;

    public Delete(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        out.println(" === Delete item === ");
        int id = Integer.parseInt(input.askStr("Введите id элемента для удаления : "));
        if (tracker.delete(id)) {
            out.println("Удаление элемента по id выполненно успешно");
        } else {
            out.println("Возникла ошибка при попытке удаления элемента"
                    + lN + "Возможно элемента с таким id не существует"
                    + lN + "Попробуйте снова");
        }
        return true;
    }
}
