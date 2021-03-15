package com.company.lesson14;

import java.util.HashMap;
import java.util.Map;

public class Task
{
    public static void main(String[] args)
    {
        Map<Person, Account> userAccounts = new HashMap<>();
        userAccounts.put(new Person("Mark", "J", 33), new Account("markJ", "qlejnbfqwfkqewjb"));
        userAccounts.put(new Person("Tom", "H", 18), new Account("tomH", "sareew"));
        userAccounts.put(new Person("Mark", "O", 12), new Account("markO", "wgesgbwsbwsr"));
        userAccounts.put(new Person("Sam", "J", 9), new Account("samJ", "wrbwsdbwrb"));
        userAccounts.put(new Person("Pol", "Q", 19), new Account("polQ", "ebfsbebbberb"));

        // додати новий акаунт і для нової людини
        System.out.println("додати новий акаунт і для нової людини");
        Person person = new Person("Jack", "R", 17);
        Account account = new Account("jackR", "hjqefwff");
        userAccounts.put(person, account);
        printMap(userAccounts);

        // замінити акаунт існуючому юзеру
        System.out.println("замінити акаунт існуючому юзеру");
        changeAccount(userAccounts, new Person("Pol", "Q"), new Account("polQ111", "eqbwfjvfdvd"));
        changeAccount(userAccounts, new Person("Rob", "Q"), new Account("robQ", "qjrkgwmwq"));
        printMap(userAccounts);

        // видалити акаунт (+ користувача)
        System.out.println("видалити акаунт (+ користувача)");
        userAccounts.remove(new Person("Tom", "H"));
        printMap(userAccounts);

        // Перевірити чи юзернейм є вільний
        System.out.println("robQ: " + isUsernameAvailable(userAccounts, "robQ"));
        System.out.println("polQ: " + isUsernameAvailable(userAccounts, "polQ111"));


    }

    private static void changeAccount(Map<Person, Account> userAccounts,
                                      Person person,
                                      Account newAccount) {
        if (userAccounts.containsKey(person)) {
            userAccounts.put(person, newAccount);
            System.out.println("Account was changed.");
        } else {
            System.out.println("User is not found.");
        }
    }

    private static boolean isUsernameAvailable(Map<Person, Account> userAccounts, String username) {
        return !userAccounts.containsValue(new Account(username));
    }

    private static void printMap(Map<Person, Account> userAccounts) {
        for (Map.Entry<Person, Account> userAccount : userAccounts.entrySet()) {
            System.out.println("Key = " + userAccount.getKey() + " / Value = " + userAccount.getValue());
        }
    }
}
