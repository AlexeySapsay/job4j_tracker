package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select : ");
            int select = Integer.parseInt(scanner.nextLine());

            if (select == 0) {
                System.out.println(" === Create a new Item === ");
                System.out.println("Enter name : ");
                String name = scanner.nextLine();
                Item item = new Item();
                item.setName(name);
                tracker.add(item);
            } else if (select == 1) {
                //Show all items
                Item[] itemsArray = new Item[100];
                itemsArray = tracker.findAll();
                for (Item elements : itemsArray) {
                    System.out.println(elements);
                }
            } else if (select == 2) {
                //2. Edit item
                System.out.println("Enter id : ");
                int id = scanner.nextInt();
                System.out.println("Enter name : ");
                String name1 = scanner.nextLine();
                Item item = new Item();
                item.setName(name1);
                tracker.replace(id, item);

                //2. Для методов replace/delete сделать вывод в виде:
                if (tracker.replace(id, item)) {
                    // вывод об успешности операции
                    System.out.println("замена элемента по id и name выполненна успешно");
                } else {
                    // вывод об ошибке
                    System.out.println("возникла ошибка при попытке замены элемента");
                    System.out.println("возможно элемента с таким id не существует");
                    System.out.println("попробуйте снова");

                }

            } else if (select == 3) {
                //3. Delete item
            } else if (select == 4) {
                //4. Find item by Id
            } else if (select == 5) {
                //5. Find items by name
            } else if (select == 6) {
                //6. Exit Program
            }
        }
    }

    private void showMenu() {
        //System.out.println("");
        System.out.println(" ******* Menu ******* ");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        //System.out.println("");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}