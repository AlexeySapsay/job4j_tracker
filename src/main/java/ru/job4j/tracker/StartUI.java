package ru.job4j.tracker;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    //public void init(Input input, Tracker tracker, UserAction[] actions) {
    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            //this.showMenu(actions);
            this.showMenu(actions);
            int select = input.askInt("Select : ");
            //if (select < 0 || select >= actions.length) {
            if (select < 0 || select >= actions.size()) {
                //out.println("Wrong input, you can select: 0 .. " + (actions.length - 1));
                out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));

                continue;
            }
            //UserAction action = actions[select];
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    //public void showMenu(UserAction[] actions) {
    public void showMenu(List<UserAction> actions) {
        out.println("Menu.");
//        for (int index = 0; index < actions.length; index++) {
        for (int index = 0; index < actions.size(); index++) {
            //out.println(index + " . " + actions[index].name());
            out.println(index + " . " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();

        //BufferAction[] bufferActions = new
        UserAction[] bufferActions = {new CreateAction(output),
                new ShowItemAction(output),
                new ReplaceAction(output),
                new DeleteAction(output),
                new FindByIdAction(output),
                new FindByNameAction(output),
                new Exit()};
//        new StartUI(output).init(input, tracker, actions);

        List<UserAction> actions = new ArrayList<UserAction>(Arrays.asList(bufferActions));

        new StartUI(output).init(input, tracker, actions);
    }
}