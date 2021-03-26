package ru.job4j.bank;
//https://job4j.ru/edu/task?action=task&taskId=0873958f758d0d5301758d8a582a2e57&number=402128
import java.util.Objects;

public class Account {
    private String requisite;
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(requisite,account.requisite);
    }

    @Override
    public int hashCode(){
        return Objects.hash(requisite);
    }
}
