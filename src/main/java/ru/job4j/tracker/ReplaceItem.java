package ru.job4j.tracker;

import org.w3c.dom.ls.LSOutput;

public class ReplaceItem implements UserAction{
    @Override
    public String name() {
        return " === Update item === ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("Enter id : "));
        String name = input.askStr("Enter a new name of item : ");
        Item item = new Item(name);
        item.setId(id);

        //2. Для методов replace/delete сделать вывод в виде:
        if (tracker.replace(id, item)) {
            // вывод об успешности операции
            System.out.println("замена элемента по id выполненна успешно");
        } else {
            // вывод об ошибке
            System.out.println("возникла ошибка при попытке замены элемента");
            System.out.println("возможно элемента с таким id не существует");
            System.out.println("попробуйте снова");
        }
        return true;
    }
}
