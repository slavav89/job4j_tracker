package ru.job4j;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает сервис банковских переводов
 *
 * @author Вячеслав
 * @version 18.0
 */
public class BankService {
    /**
     * Это поле содержит всех пользователей системы
     * с привязанными к ним счетами
     * Хранение осуществляется в коллекции типа Map
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя и добавляет его в коллекцию,
     * если данного пользователя нет в системе.
     *
     * @param user пользователь который добавляется в коллекцию
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод принимает на вход номер паспорта
     * и удаляет пользователя паспорта из коллекции
     *
     * @param passport номер паспорта, пользователя которого необходимо удалить
     * @return {@code true} если пользователь успешно удален
     */
    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    /**
     * Метод принимает на вход номер паспорта и счет, который
     * необходимо добавить пользователю паспорта.
     * Если входящий счет уже имеется у пользователя,
     * то добавление не происходит
     *
     * @param passport номер паспорта пользователя,
     *                 которому необходимо добавить счет
     * @param account  счет, который необходимо добавить
     *                 пользователю паспорта
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            if (!list.contains(account)) {
                list.add(account);
            }
        }
    }

    /**
     * Этот метод ищет пользователя по номеру паспорта
     *
     * @param passport номер паспорта искомого пользователя
     * @return возвращает найденного пользователя, если пользователь не найден,
     * то возвращает null.
     */
    public User findByPassport(String passport) {
        User rsl = null;
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                rsl = key;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод ищет счет пользователя по реквизитам
     *
     * @param passport  номер паспорта пользователя
     * @param requisite реквизиты банковского счета
     * @return возвращает счет пользователя
     */
    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            for (Account account : list) {
                if (account.getRequisite().equals(requisite)) {
                    rsl = account;
                    break;
                }
            }
        }
        return rsl;
    }

    /**
     * Метод предназначен для перечисления денег с одного счёта на другой счёт
     *
     * @param srcPassport   номер паспорта пользователя кто переводит деньги
     * @param srcRequisite  реквизиты счета откуда переводятся деньги
     * @param destPassport  номер паспорта пользователя кому переводят деньги
     * @param destRequisite реквизиты счета куда переводятся деньги
     * @param amount        сумма денежного перевода
     * @return {@code true} если перевод произведен успешно
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            destAccount.setBalance(destAccount.getBalance() + amount);
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}