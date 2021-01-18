package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    //Это поле содержит всех пользователей
    // системы с привязанными к ним счетами.
    private Map<User, List<Account>> users = new HashMap<>();

    // add new user

    /**
     * Это метод должен добавить пользователя в систему.
     * Чтобы добавить пользователя в систему нужно использовать метод Map.put.
     * Этот метод принимает два параметра: пользователя и список счетов.
     * По умолчанию нужно добавить пустой список - new ArrayList<Account>().
     * В методе должна быть проверка, что такого пользователя еще нет в системе.
     * Если он есть, то нового добавлять не надо.
     */
    public void addUser(User user) {
        ArrayList<Account> accounts = new ArrayList<Account>();
        // тупо добавляем нового пользователя без проверки
        // так не стоит делать, т.к можно затереть уже
        // существуюещго пользователя
        //users.put(user,accounts);

        // делаем проверку, если
        // пользователь уже существует,
        // то нового не добавляем
        //if(user.getPassport().equals(users.putIfAbsent(user.getPassport(), accounts))){
        //}

        //if(user.getPassport().){}
        //users.putIfAbsent(user, accounts);

        users.putIfAbsent(user, accounts);
        //System.out.println(users + "that is new user");
        System.out.println("that is new user");

    }


    // add  new account for user

    /**
     * Должен добавить новый счет к пользователю.
     * Первоначально пользователя нужно найти по паспорту.
     * Для этого нужно использовать метод findByPassport.
     */
    public void addAccount(String passport, Account account) {

    }

    /**
     * После этого мы получим список всех счетов пользователя и
     * добавим новый счет к ним.
     * В этом методе должна быть проверка, что такого счета у пользователя еще нет.
     */

    /**
     * Это метод ищет пользователя по номеру паспорта. Здесь нужно
     * использовать перебор всех элементов через цикл for-earch и метод Map.keySet.
     */

    public User findByPassport(String passport) {
        return null;
    }

    /**
     * Этот метод ищет счет пользователя по реквизитам.
     * Сначала нужно найти пользователя.
     * Потом получить список счетов этого пользователя и в нем найти нужный счет.
     */
    public Account findByRequisite(String passport, String requisite) {
        return null;
    }


    /**
     * Метод для перечисления денег с одного счёта на другой счёт.
     * Если счёт не найден или не хватает денег на счёте srcAccount
     * (с которого переводят), то метод должен вернуть false.
     */

    public boolean transferMoney(String srcPassport,
                                 String srcRequisite,
                                 String destPassport,
                                 String destRequisite,
                                 double amount) {
        boolean rsl = false;
        return rsl;
    }


//    public static void main(String[] args) {
//        List<Account> accounts = new ArrayList<>();
//        String requisite = "3fdsbb9";
//        accounts.add(new Account("3fdsbb9", 140));
//        int index = accounts.indexOf(new Account(requisite, -1));
//        Account find = accounts.get(index);
//        System.out.println(find.getRequisite() + " -> " + find.getBalance());
//    }

//    public static void main(String[] args) {
//        List<Account> accounts = new ArrayList<>();
//        String requisite = "q32alasdf";
//        accounts.add(new Account("q32alasdf",1000));
//        int index = accounts.indexOf(new Account(requisite,1));
//        Account find = accounts.get(index);
//        System.out.println(find.getRequisite()+" has: "+ find.getBalance()+" dollars");
//
//       // System.out.println(users.entrySet());
//
//    }

    public static void main(String[] args) {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        System.out.println("Passport is : " + user.getPassport()
                + " User name : " + user.getUsername());


        User user1 = new User("3434", "Alex Navalniy");
        bank.addUser(user1);
        System.out.println("Passport is : " + user1.getPassport()
                + " User name : " + user1.getUsername());


        System.out.println("Passport is : " + user.getPassport()
                + " User name : " + user.getUsername());

        System.out.println("Passport is : " + user1.getPassport()
                + " User name : " + user1.getUsername());


    }
}
