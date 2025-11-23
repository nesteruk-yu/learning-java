package task16;

import java.util.Objects;

//1. Создать класс счёт (Account). Поля идентификатор счёта (id), номер счёта, валюта счёт (String), сумма счёта (Double). Выполнить переопределение equals и hashcode по двум полям (id и номер счёта), так как логически, эти поля будут уникальными для каждого счёта.

public class Account {
    private int id;
    private String number;
    private String currency;
    private double amount;


    public Account(int id, String number, String currency, double balance) {
        this.id = id;
        this.number = number;
        this.currency = currency;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        Account account = (Account) o;
        return id == account.id && number == account.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double balance) {
        this.amount = amount;
    }
}
