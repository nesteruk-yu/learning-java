package task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
//1. Вывести все числа кратные 7 или 3 в диапазоне от 1 до 100. (можно использовать цикл for)

//        int x = 1;
//
//        while (x <= 100) {
//            if (x%7 == 0 || x%3 == 0) {
//                System.out.println(x);
//            }
//            x++;
//        }

//2. Ввести 2 положительных числа с консоли с помощью сканера. Вывести сумму всех чисел от одного числа до другого.
// (Используйте цикл while).Подсказка. До цикла объявите переменную int sum=0. В самом цикле перезаписывайте в эту переменную сумму чисел.

//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Введи четное число i");
//        int i = in.nextInt();
//
//        System.out.println("Введи четное число j");
//        int j = in.nextInt();
//
//        int sum = 0;
//
//        while (i>=j) {
//            sum+= i--;
//        }
//        System.out.println(sum);
//
//        while (j>=i) {
//            sum+= j--;
//        }
//        System.out.println(sum);

//3* Ввести число с консоли, которое не заканчивается на 0.Вывести число в обратном порядке. Использовать оператор %.
//
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Введи число, которое не заканчивается на 0");
//
//        int i = in.nextInt();
//
//        int sum = 0;
//
//        while (i%10==0) {
//            System.out.println("Введи число, которое не заканчивается на 0");
//            i = in.nextInt();
//        }
//
//        while (i > 0) {
//            int k = i%10;
//            i=(i-k)/10;
//            sum = sum*10+k;
//        }
//        System.out.println(sum);

//  4* Ввести число с консоли, которое не заканчивается на 0.Вывести чётные и нечётные числа через while and if. Использовать оператор %.
        Scanner in = new Scanner(System.in);

        System.out.println("Введи число, которое не заканчивается на 0");

        int i = in.nextInt();

        int chetnoe = 0;
        int nechetnoe = 0;

        while (i % 10 == 0) {
            System.out.println("Введи число, которое не заканчивается на 0");
            i = in.nextInt();
        }

        while (i > 0) {
            int k = i % 10;
            if (k % 2 == 0) {
                chetnoe = chetnoe * 10 + k;
                i = (i - k) / 10;
            } else {
                nechetnoe = nechetnoe * 10 + k;
                i = (i - k) / 10;
            }
        }
        System.out.println(chetnoe);
        System.out.println(nechetnoe);
    }
}
