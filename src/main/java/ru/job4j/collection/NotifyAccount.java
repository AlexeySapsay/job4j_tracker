package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<Account>(accounts);
        //HashSet<Account> rsl = new HashSet<>();
        // задачу можно решить без цикла, просто передав в качестве параметра
        // в HashSet accounts, но для тренировки навыка напишу цикл

        /* for-each accounts to HashSet; */
//        for(Account element : accounts){
//            rsl.add(element);
//        }

        /* for-each accounts to HashSet; */

//        for(Account element : accounts){
//            System.out.println(rsl);
//        }
        return rsl;
    }
}
