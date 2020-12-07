package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return " === Delete item === ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("Введите id элемента для удаления : "));
        if (tracker.delete(id)) {
            System.out.println("Удаление элемента по id выполненно успешно");
        } else {
            System.out.println("Возникла ошибка при попытке удаления элемента");
            System.out.println("Возможно элемента с таким id не существует");
            System.out.println("Попробуйте снова");
        }
        return true;
    }
}
