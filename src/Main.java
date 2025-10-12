import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(2, "Petya", "Ivanov", "math", 1, "1", 6);
        Student student2 = new Student();
        student1.info();
        student2.changeGroup("four");
        System.out.println(student2.showCurrentGroup());
        student1.changeMarkAndGroup(5, "Chemistry");
        System.out.println(student1.showCurrentGroup());

// 6. В классе main создать массив из пяти студентов.
        Student[] students = {
                new Student(1, "Gena", "Sidorov", "math", 2, "2", 4),
                new Student(2, "Olga", "Fetisov", "sewing", 3, "3", 9),
                new Student(3, "Dima", "Dylgeru", "gaming", 5, "3", 4),
                new Student(4, "Poly", "Kuchmar", "design", 6, "7", 8),
                new Student(5, "Vera", "Makaruk", "artist", 7, "4", 8)
        };

//  Вывод списка студентов с оценкой выше mark - задание 7 и 8
        for (Student student : student1.getStudentsMark(students, 6)) {
            if(student == null) {
                continue;
            }
            student.info();
        }

//        8. В классе main из полученных студентов из задания 7 пройтись в цикле по массиву и вызвать на каждом студенте метод info, который вы создавали в задании 2


    }
}