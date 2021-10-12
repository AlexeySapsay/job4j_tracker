package ru.job4j.tracker;

import ru.job4j.tracker.model.Item;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        out.println(" === Find item by Id === ");
        int id = Integer.parseInt(input.askStr("Введите id элемента для поиска : "));
        Item item = tracker.findById(id);
        if (item == null) {
            out.println("Заявка с таким id не найдена");
        } else {
            out.println(item.getName());
        }
        return true;
    }
}
