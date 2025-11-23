package task16;

//2. Создать класс Банк.  В классе банка будет одно поле: коллекция из счетов (Set<Account> accounts)

import java.util.HashSet;
import java.util.Set;

public class Bank {
    Set<Account> accounts;

    public Bank(Set<Account> accounts) {
        this.accounts = accounts;
    }

//5. В классе банк реализовать метод перевода денежных средств с одного счёта на другой. Сигнатура метода будет такая:
//public void transferMoney(String  accountNumberFrom, String accountNumberTo, Double amount)

    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount) throws AccountNotFoundException, NotEnoughMoneyException {
        this.transferMoney(accountNumberFrom, accountNumberTo, amount, 1);
    }

//9. *В классе банк реализуйте метод перевода денег со счёта на счёт, который будет работать со счетами, у которых разные валюты (USD и BYN). Сигнатура метода такая:
//public void transferMoney(String  accountNumberFrom, String accountNumberTo, Double amount, double exchangeRate). exchangeRate это курсовая разница между доларом и белорусским рублём. Проверки выполните те же что и в пункте 5.

    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount, double exchangeRate) throws AccountNotFoundException, NotEnoughMoneyException {

        Account accountFrom = null;
        Account accountTo = null;

        for (Account account : accounts) {
            if (account.getNumber() == accountNumberFrom) {
                accountFrom = account;
            }

            if (account.getNumber() == accountNumberTo) {
                accountTo = account;
            }
        }

//5.1 Если в банке отсутствует номер счёта с которого переводят деньги или номер счёта куда переводят деньги, выбрасывает своё исключение AccountNotFoundException с errorCode= not.found.account

        if (accountFrom == null || accountTo == null) {
            throw new AccountNotFoundException("not.found.account");
        }

        double minusAmount;
        double plusAmount;

        double amountUsd = amount / exchangeRate;
        if (accountFrom.getCurrency() == "USD") {
            minusAmount = amountUsd;
        } else {
            minusAmount = amount;
        }

        if(accountTo.getCurrency() == "USD") {
            plusAmount = amountUsd;
        } else {
            plusAmount = amount;
        }
        
//5.2 Если на счёте, с которого переводят деньги, сумма меньше переводимой то выбросить своё исключение NotEnoughMoneyException с errorCode=not.enough.money.

        if (accountFrom.getAmount() < minusAmount) {
            throw new NotEnoughMoneyException("not.enough.money");
        }

//5.3  Соответсвтенно выполните логику перевода денег в белорусской валюте (отнимаете переводимую сумму со счёта, с которого идёт перевод и прибавляете сумму перевода счёту, на который происходит перевод. При этом сначала надо найти счета по переданным номерам в банке.

        accountTo.setAmount(accountTo.getAmount() + plusAmount);
        accountFrom.setAmount(accountFrom.getAmount() - minusAmount);
    }
}
