import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

//        1. Создать массив из 10 элементов. Заполните массив числами и вывести их в консоль (выводите через цикл for each).
//        Замените каждый элемент с нечётным индексом на ноль. Выведите полученный массив в консоль через цикл for each
//
//        int [] massive = {4, 34, 23, 67, 23, 12, 877, 54, 1, 100};
//
//        for (int l : massive) {
//            System.out.println(l);
//        }

//        2.    Создать массив из 5 чисел и заполните этот массив вручную.
//        Создайте второй массив с размерностью больше на 1 чем первый массив.
//        Необходимо скопировать первый массив со всеми значениями во второй массив.
//        Последний элемент во втором массиве пусть будет 0.
//        Выведите второй массив в консоль с помощью цикла for each.

//        int [] massive = {12, 877, 54, 1, 100};
//        int [] massive2 = new int[massive.length + 1];
//
//        for (int i = 0; i < massive.length; i++) {
//            massive2[i] = massive[i];
//        }
//
//        for (int l : massive2) {
//            System.out.println(l);
//        }

//  3.* Создать массив вручную.Заменить максимальный и минимальный элемент массива.
// Новый минимальный элемент будет (-1000), новый максимальный элемент 1000.
//        int [] massive = {12, 877, 54, 1, 100};
//
//        int min = massive[0];
//        int max = massive[0];
//
//        for (int i = 0; i < massive.length; i++) {
//
//            if (massive[i] > max) {
//                max = massive[i];
//            }
//
//            if (massive[i] < min) {
//                min = massive[i];
//            }
//        }
//        System.out.println("Минимальное число = " + min);
//        System.out.println("Максимальное число = " + max);

//  4.* Создать массив (вручную). Отсортировать элементы массива в порядке возрастания.
//  Вывести полученный массив. Выполнить с помощью цикла for

        int [] massive = {12, 877, 54, 1, 100};

        for (int i = massive.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {

                if (massive[j] > massive
                        [j + 1]) {
                    int x = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = x;
                }
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}
