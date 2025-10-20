package task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

//1. На вход даны 3 числа. Вывести в консоль только четные числа
        Scanner in = new Scanner(System.in);

        System.out.println("Введи а");
        int a = in.nextInt();

        if (a % 2 == 0){
            System.out.println("а является четным числом и равно " + a);
        } else {
            System.out.println("а не является четным числом");
        }

        System.out.println("Введи b");
        int b = in.nextInt();

        if (b % 2 == 0){
            System.out.println("b является четным числом и равно " + b);
        } else {
            System.out.println("b не является четным числом");
        }

        System.out.println("Введи c");
        int c = in.nextInt();

        if (c % 2 == 0){
            System.out.println("c является четным числом и равно " + c);
        } else {
            System.out.println("с не является четным числом");
        }

    }

//    2. На вход даны 3 числа. Вывести в консоль только те числа, которые делятся на 2 и на 5
//    (используйте оператор % для проверки деления без остатка)

//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Введи а");
//        int a = in.nextInt();
//
//        System.out.println("Введи b");
//        int b = in.nextInt();
//
//        System.out.println("Введи c");
//        int c = in.nextInt();
//
//        if (a % 2 == 0 && a % 5 == 0) {
//            System.out.println("а делится на 2 и на 5");
//        }
//
//        if (b % 2 == 0 && b % 5 == 0) {
//            System.out.println("b делится на 2 и на 5");
//        }
//
//        if (c % 2 == 0 && c % 5 == 0) {
//            System.out.println("c делится на 2 и на 5");
//        }

//  3. Дано 15/x=result, где x-число, которое вводится с командной строки, result-результат вычисления.
//  Написать программу, которая будет выводить разный текст, в зависимости от значения result.
//  В случае result=3, вывести: "Результат деления равен 3" В случае result=5 вывести:
//  "Результат деления равен 5" В других случаях вывести: "Результат деления равен дробному числу".
//  При этом в последнем случае вывести точный результат деления (использовать приведение типов)
//  Для выполнения задания использовать оператор switch- case
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Введи x");
//        int x = in.nextInt();
//        float result = 15 / (float)x;
//
//        switch (15 / x) {
//            case 3: System.out.println("Результат деления равен 3");
//            break;
//            case 5: System.out.println("Результат деления равен 5");
//            break;
//            default: System.out.println("Результат деления равен дробному числу " + result);
//        }
}
