package ru.job4j.bank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

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

        // create account
//        List<Account> accounts = new ArrayList<>();
//        String requisite = "3fdsbb9";
//        accounts.add(new Account("3fdsbb9", 140));
//        int index = accounts.indexOf(new Account(requisite, -1));
//        Account find = accounts.get(index);
//        System.out.println(find.getRequisite() + " -> " + find.getBalance());
//
//        int index = accounts.indexOf(new Account(requisite, -1));
//        Account find = accounts.get(index);
//        System.out.println(find.getRequisite() + " = " + find.getBalance());

        //create account2
//        String requisite2 = "6660666";
//        accounts.add(new Account(requisite2, 100_000_000));
//        int index2 = accounts.indexOf(new Account(requisite2, -1));
//        Account find2 = accounts.get(index2);
//        System.out.println(find2.getRequisite() + " = " + find2.getBalance());


        //test findByPassport
//        User user1 = new User("6006 155555", "Alex Saps");
//        BankService bank = new BankService();
//        bank.addUser(user1);
//        System.out.println("user1 изначальный : " + user1);
//        System.out.println("user1 после помещения его в  bank.users" + bank.users);
//        System.out.println("результат поиска user1 " +
//                "через findByPassport" + bank.findByPassport("6006 155555") + "\n");

//        User user2 = new User("0000 0000", "Alex Navalniy");
//        bank.addUser(user2);
//        System.out.println("user2 изначальный : " + user2);
//        System.out.println("user2 после помещения его в  bank.users" + bank.users);
//        System.out.println("user2 passport: " + user2.getPassport()
//                + "user2 username : " + user2.getUsername() + "\n");

        // нужно добавить проверку на уже существющего юзера, что бы
        // его невозможно было перезаписать, если он существует
        // перезаписили юзера к которого был номер пасспорта 0000 0000 и имя "Alex Navalniy"
        // которого совпадает номер паспорта 0000 0000 и имя "Alex Ovalniy"
//        User user3 = new User("0000 0000", "Alex Ovalniy");
//        bank.addUser(user3);
//        System.out.println("user3 изначальный : " + user3);
//        System.out.println("user3 после помещения его в  bank.users" + bank.users);
//        System.out.println("результат поиска user3 " +
//                "через findByPassport" + bank.findByPassport("0000 0000"));
//        System.out.println("user3 passport: " + user3.getPassport()
//                + "user3 username : " + user3.getUsername() + "\n");

//        System.out.println("результат поиска user1 " +
//                "через findByPassport : " + bank.findByPassport("6006 155555").getUsername() + "\n");

//        User user4 = new User("0000 0000", "Alex Ivanov");
//        bank.addUser(user4);
//        System.out.println("результат поиска user4 " +
//                "через findByPassport" + bank.findByPassport("0000 0000"));
//        System.out.println("user4 passport: " + user4.getPassport()
//                + "user4 username : " + user4.getUsername() + "\n");
//
//        System.out.println(user4);


        //System.out.println(users.findByPassport());
//        for (User user : bank.users.keySet()) {
//            System.out.println("user: " + user +
//                    "user.getUsername(): " + user.getUsername() +
//                    "user.getPassport()" + user.getPassport() + "\n");
//        }


        // test for addAccount
        //bank.addAccount("0000 0000", new Account("6660666", 1000));
        //bank.addAccount("0000 0000", new Account("0000001", 1));
        // account is absent
        //bank.addAccount("1111 1111",null);

        // take list of accounts from user
//        String requisite = "3fdsbb9";
//        accounts.add(new Account("3fdsbb9", 140));
//
//        System.out.println("accounts" + accounts+
//                accounts.get(0));


        // test for transfer money

        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        System.out.println((bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150D)));

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
        users.putIfAbsent(user, accounts);
    }


    /**
     * Метод добавляет новый счет пользователю.
     * Первоначально пользователя нужно найти по паспорту.
     * Для этого нужно использовать метод findByPassport.
     * <p>
     * После этого мы получим список всех счетов пользователя и
     * добавим новый счет к ним.
     * В этом методе должна быть проверка, что такого счета у пользователя еще нет.
     * <p>
     * //+1. Нашли юзера по паспорту
     * //+2. Проверяем найденного юзера на null
     * //+3. Получаем список аккаунтов по найденному юзеру
     * //+4. Если список не содержит аккаунт
     * // который мы хотим добавить - то добавляем его с помощью add
     *
     * @param passport
     * @param account
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccount = users.get(user);
            if (!userAccount.contains(account)) {
                userAccount.add(account);
            }
        }
    }


    /**
     * Это метод ищет пользователя по номеру паспорта. Здесь нужно
     * использовать перебор всех элементов через цикл for-each и метод Map.keySet.
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
     * Потом получить список счетов этого пользователя
     * и в нем найти нужный счет.
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccount = users.get(user);
            for (Account account : userAccount) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
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
        //1.1 проверить существование источника по паспорту и реквизитам
        //1.2 проверить существование принимающего по паспорту и реквизитам
        if ((findByPassport(srcPassport) == null) ||
                (findByRequisite(srcPassport, srcRequisite) == null) ||
                (findByPassport(destPassport) == null) ||
                (findByRequisite(destPassport, destRequisite) == null)) {
            return false;
        }

        //2 несли не хватает денег на счете с которого переводят
        // то возвращаем false
        // проверка существование src account
        Account srcAccount = new Account(null, -1);
        User user1 = findByPassport(srcPassport);
        if (user1 != null) {
            List<Account> userAccount = users.get(user1);
            for (Account account : userAccount) {
                if (account.getRequisite().equals(srcRequisite)) {
                    srcAccount = account;
                }
            }
        }
        // проверяем достаточно ли денег на счете, с которого выполняем перевод
        // если не достаточно, то возвращаем false
        if (srcAccount.getBalance() < amount) {
            return false;
        }

        // проверка существование dest account
        Account destAccount = new Account(null, -1);
        User user2 = findByPassport(destPassport);
        if (user2 != null) {
            List<Account> userAccount = users.get(user2);
            for (Account account : userAccount) {
                if (account.getRequisite().equals(destRequisite)) {
                    destAccount = account;
                }
            }
        }


        // 3 выполнить перевод с одного аккаунта на другой
        // уменьшить значение в первом и прибавить значение во втором
        double srcBalanceRaw = srcAccount.getBalance();
        double srcBalanceWithoutAmount = srcBalanceRaw - amount;

        double destBalanceRaw = destAccount.getBalance();
        double destBalanceWithAmount = destBalanceRaw + amount;

        srcAccount.setBalance(srcBalanceWithoutAmount);
        destAccount.setBalance(destBalanceWithAmount);

        System.out.println("srcAccount balance : " + srcAccount.getBalance());
        System.out.println("destAccount balance : " + destAccount.getBalance());


        boolean rsl = true;
        return rsl;
    }
}
