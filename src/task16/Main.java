package task16;

//6. В классе Main создайте пять счетов. Добавьте эти счета в банк (класс Bank)

//7.1 Если пришло исключение AccountNotFoundException то выведите в консоль «Откройте счёт в нашем банке для выполнения переводов»
//7.2 Если пришло исключение NotEnoughMoneyException то выведите в консоль «Недостаточно средств для перевода»
//7.3 В обоих случаях не пробрасывайте исключения дальше. Программа должна продолжать работу.
//8. Добавьте блок finally. В блоке finally выведите в консоли «Спасибо,что вопользовались услугами банка»
//9. *В классе банк реализуйте метод перевода денег со счёта на счёт, который будет работать со счетами, у которых разные валюты (USD и BYN). Сигнатура метода такая:
//public void transferMoney(String  accountNumberFrom, String accountNumberTo, Double amount, double exchangeRate). exchangeRate это курсовая разница между доларом и белорусским рублём. Проверки выполните те же что и в пункте 5.

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1, "234", "BYN", 6000);
        Account account2 = new Account(2, "235", "USD", 2000);
        Account account3 = new Account(3, "236", "EUR", 600);
        Account account4 = new Account(4, "237", "USD", 4000);
        Account account5 = new Account(5, "238", "BYN", 1000);

        Set<Account> accountSet = new HashSet<>();
        accountSet.add(account1);
        accountSet.add(account2);
        accountSet.add(account3);
        accountSet.add(account4);
        accountSet.add(account5);

        Bank bank = new Bank(accountSet);

//7. В классе Main в блоке try catch выполните вызов метода по переводу денег со счёта на счёт. При этом выполните обработку вашего выбрасываемого исключения в двух блоках catch

        try {
            bank.transferMoney("234", "238", 100.0);
        } catch (AccountNotFoundException e) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств для перевода");
        } finally {
            System.out.println("Спасибо,что вопользовались услугами банка");
        }
    }
}
