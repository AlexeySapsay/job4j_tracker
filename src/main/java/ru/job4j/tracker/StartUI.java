package ru.job4j.tracker;


public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select : ");
            int select = Integer.parseInt(input.askStr(msg));

            if (select == 0) {
                System.out.println(" === Create a new Item === ");
                System.out.println("Enter name : ");
                String name = input.askStr(msg);
                Item item = new Item(name);
                tracker.add(item);

            } else if (select == 1) {
                //Show all items
                Item[] itemsArray = tracker.findAll();
                for (Item elements : itemsArray) {
                    System.out.println(elements);
                }

            } else if (select == 2) {
                //2. Edit item
                System.out.println("Enter id : ");
                int id = Integer.parseInt(input.askStr(msg));
                System.out.println("Enter name : ");
                String name = input.askStr(msg);
                Item item = new Item(name);

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

            } else if (select == 3) {
                //3. Delete item
                System.out.println("Введите id элемента для удаления : ");
                int id = Integer.parseInt(input.askStr(msg));
                if (tracker.delete(id)) {
                    // вывод об успешности операции
                    System.out.println("Удаление элемента по id выполненно успешно");
                } else {
                    // вывод об ошибке
                    System.out.println("Возникла ошибка при попытке удаления элемента");
                    System.out.println("Возможно элемента с таким id не существует");
                    System.out.println("Попробуйте снова");
                }

            } else if (select == 4) {
                //4. Find item by Id
                System.out.println("Введите id элемента для поиска : ");
                int id = Integer.parseInt(input.askStr(msg));
                Item item = tracker.findById(id);
                if (item == null) {
                    System.out.println("Заявка с таким id не найдена");
                } else {
                    System.out.println(item.getName());
                }

            } else if (select == 5) {
                //5. Find items by name
                System.out.println("Введите имя для поиске в списке заявок");
                String name = input.askStr(msg);
                Item[] itemArray = tracker.findByName(name);

                if (itemArray.length == 0) {
                    System.out.println("Заявки с таким именем не найдены");
                } else {
                    for (Item element : itemArray) {
                        System.out.println(element);
                    }
                }

            } else if (select == 6) {
                System.out.println("Выходим из программы ");
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println(" ******* Menu ******* ");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        //String msg = "Inter id:";
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}