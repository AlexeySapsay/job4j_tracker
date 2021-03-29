package ru.job4j.bank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class BankService {
//    public static void main(String[] args) {
//        // test for transfer money
//        User user = new User("3434", "Petr Arsentev");
//        BankService bank = new BankService();
//        bank.addUser(user);
//        bank.addAccount(user.getPassport(), new Account("5546", 150D));
//        bank.addAccount(user.getPassport(), new Account("113", 50D));
//        System.out.println((bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150D)));
//    }


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
//    public User findByPassport(String passport) {
//        for (Map.Entry<User, List<Account>> entry : users.entrySet()) {
//            if (entry.getKey().getPassport().equals(passport)) {
//                return entry.getKey();
//            }
//        }
//        return null;
//    }

    // упрощенная часть кода, где перебираем только keySet()
    // рефакторинг провел Стас Коробейников.
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
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

        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);

        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            return true;
        }
        return false;
    }
}
