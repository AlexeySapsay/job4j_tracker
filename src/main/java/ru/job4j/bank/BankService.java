package ru.job4j.bank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

/**
 * Программа эмитирует работу банка.
 * Позволяет добавлять и пользователя User,
 * Добавляеть счета- Accounts пользоваелю и выполнять
 * перевод денег между счетами.
 */

public class BankService {
    // блок кода для ручного тестирования и отладки программы

// public static void main(String[] args) {
    // test for transfer money
// User user = new User("3434", "Petr Arsentev");
// BankService bank = new BankService();
// bank.addUser(user);
// bank.addAccount(user.getPassport(), new Account("5546", 150D));
// bank.addAccount(user.getPassport(), new Account("113", 50D));
// System.out.println((bank.transferMoney(user.getPassport(),
// "5546", user.getPassport(), "113", 150D)));
// }

    /**
     * Это поле содержит всех пользователей
     * системы с привязанными к ним счетами.
     * Для хранения пользователей применяем коллекцию Map
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Это метод должен добавить пользователя в систему.
     * Чтобы добавить пользователя в систему нужно использовать метод Map.put.
     * Этот метод принимает два параметра: пользователя и список счетов.
     * По умолчанию нужно добавить пустой список - new ArrayList.
     * В методе должна быть проверка, что такого пользователя еще нет в системе.
     * Если он есть, то нового добавлять не надо.
     *
     * @param user - пользователь системы
     */
    public void addUser(User user) {
        ArrayList<Account> accounts = new ArrayList<>();
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
     * @param passport - паспорт user
     * @param account  - счет, аккаунт user
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
     * Это метод ищет пользователя по номеру паспорта.
     * Здесь нужно использовать перебор всех элементов через
     * цикл for-each и keySet()
     *
     * @param passport - паспорт user
     * @return User или null в случае, когда не удается найти User
     * по заданному @param passport
     */

    //maked method findByPassport like a pro by stream!
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Этот метод ищет счет пользователя по реквизитам.
     * Сначала нужно найти пользователя.
     * Потом получить список счетов этого пользователя
     * и в нем найти нужный счет.
     *
     * @param passport  passport - паспорт user
     * @param requisite - реквизиты user, его
     * @return Account or null если пользователь с таким
     * passport or requisite не найден
     */

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(account ->
                            account.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод для перечисления денег с одного счёта на другой счёт.
     * Если счёт не найден или не хватает денег на счёте srcAccount
     * (с которого переводят), то метод должен вернуть false.
     *
     * @param srcPassport   - паспорт счета источника денег
     * @param srcRequisite  - реквизиты источника денег
     * @param destPassport  -паспорт счета получателя денег
     * @param destRequisite - реквизиты получателя денег
     * @param amount        -количество денег для перевода
     * @return true - если перевод выполнен учпешно и false-
     * когда перевод не выполнен
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
