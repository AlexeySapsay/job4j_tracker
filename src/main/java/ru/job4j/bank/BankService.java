package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    public static void main(String[] args) {
//        User user = new User("3434", "Petr Arsentev");
//        BankService bank = new BankService();
//        bank.addUser(user);
//        System.out.println("Passport is : " + user.getPassport()
//                + " User name : " + user.getUsername());
//
//
//        User user1 = new User("3434", "Alex Navalniy");
//        bank.addUser(user1);
//        System.out.println("Passport is : " + user1.getPassport()
//                + " User name : " + user1.getUsername());
//
//
//        System.out.println("Passport is : " + user.getPassport()
//                + " User name : " + user.getUsername());
//
//        System.out.println("Passport is : " + user1.getPassport()
//                + " User name : " + user1.getUsername());


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

        List<Account> accounts = new ArrayList<>();
        String requisite = "3fdsbb9";
        accounts.add(new Account("3fdsbb9", 140));
        int index = accounts.indexOf(new Account(requisite, -1));
        Account find = accounts.get(index);
        System.out.println(find.getRequisite() + " -> " + find.getBalance());


        //test findByPassport
        User user1 = new User("6006 155555", "Alex Saps");
        BankService bank = new BankService();
        bank.addUser(user1);
//        System.out.println("user1 изначальный : " + user1);
//        System.out.println("user1 после помещения его в  bank.users" + bank.users);
//        System.out.println("результат поиска user1 " +
//                "через findByPassport" + bank.findByPassport("6006 155555") + "\n");

        User user2 = new User("0000 0000", "Alex Navalniy");
        bank.addUser(user2);
//        System.out.println("user2 изначальный : " + user2);
//        System.out.println("user2 после помещения его в  bank.users" + bank.users);
//        System.out.println("user2 passport: " + user2.getPassport()
//                + "user2 username : " + user2.getUsername() + "\n");

        // нужно добавить проверку на уже существющего юзера, что бы
        // его невозможно было перезаписать, если он существует
        // перезаписили юзера к которого был номер пасспорта 0000 0000 и имя "Alex Navalniy"
        // которого совпадает номер паспорта 0000 0000 и имя "Alex Ovalniy"
        User user3 = new User("0000 0000", "Alex Ovalniy");
        bank.addUser(user3);
//        System.out.println("user3 изначальный : " + user3);
//        System.out.println("user3 после помещения его в  bank.users" + bank.users);
//        System.out.println("результат поиска user3 " +
//                "через findByPassport" + bank.findByPassport("0000 0000"));
//        System.out.println("user3 passport: " + user3.getPassport()
//                + "user3 username : " + user3.getUsername() + "\n");

//        System.out.println("результат поиска user1 " +
//                "через findByPassport : " + bank.findByPassport("6006 155555").getUsername() + "\n");

        User user4 = new User("0000 0000", "Alex Ivanov");
        bank.addUser(user4);
//        System.out.println("результат поиска user4 " +
//                "через findByPassport" + bank.findByPassport("0000 0000"));
//        System.out.println("user4 passport: " + user4.getPassport()
//                + "user4 username : " + user4.getUsername() + "\n");
//
//        System.out.println(user4);


        //System.out.println(users.findByPassport());
        for (User user : bank.users.keySet()) {
            System.out.println("user: " + user +
                    "user.getUsername(): " + user.getUsername() +
                    "user.getPassport()" + user.getPassport() + "\n");
        }

    }


    /**
     * Это поле содержит всех пользователей
     * системы с привязанными к ним счетами.
     **/
    private Map<User, List<Account>> users = new HashMap<>();

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

        //+ users.putIfAbsent(user, accounts);
        // нужно добавить проверку юзера по одинаковому паспорту в мапе,
        // проверку по одинаковому имени выполнять не нужно, т.к
        // в реальности могут быть однофамильцы и одноименцы

        // подумать, стоит ли добавлять таким образом юзера
//        for (Map.Entry<User, List<Account>> entry : users.entrySet()) {
//            if (entry.getKey().getPassport().equals(user.getPassport())) {
//                users.put(user, accounts);
//            }
//        }
//        System.out.println(user + "user :" +
//                "accounts :" + accounts +
//                "getPassport() : " + user.getPassport() +
//                "getUsername() :" + user.getUsername() + "\n");

        users.putIfAbsent(user, accounts);


        //- тупо добавляем нового пользователя без проверки
        // так не стоит делать, т.к можно затереть уже
        // существуюещго пользователя
        //users.put(user, accounts);


        //- делаем проверку, если
        // пользователь уже существует,
        // то нового не добавляем
        //if(user.getPassport().equals(users.putIfAbsent(user.getPassport(), accounts))){
        //}


        //- не работает, перепроверить реализацию
        // возможно ошибка не так далеко как может показаться изначально
//        if (user.getPassport() == null) {
//            users.putIfAbsent(user, accounts);
//            System.out.println("User is absent! that is new user");
//        }

        //users.putIfAbsent(user, accounts);
        //System.out.println(users + "that is new user");
    }


    /**
     * Метод добавляет новый счет пользователю.
     * Первоначально пользователя нужно найти по паспорту.
     * Для этого нужно использовать метод findByPassport.
     * <p>
     * После этого мы получим список всех счетов пользователя и
     * добавим новый счет к ним.
     * В этом методе должна быть проверка, что такого счета у пользователя еще нет.
     */
    public void addAccount(String passport, Account account) {
        // пишем поиск по паспорту, если юзер есть
        // то добавляем ему аккаунт
    }


    /**
     * Это метод ищет пользователя по номеру паспорта. Здесь нужно
     * использовать перебор всех элементов через цикл for-earch и метод Map.keySet.
     */
    public User findByPassport(String passport) {
        for (Map.Entry<User, List<Account>> entry : users.entrySet()) {
            if (entry.getKey().getPassport().equals(passport)) {
                return entry.getKey();
            }
        }
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
}
