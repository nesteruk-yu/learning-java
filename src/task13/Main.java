package task13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//1.1. Создать несколько студентов.

        Student student1 = new Student("Александр", "Смоляк", 1987, "Минск", 7);
        Student student2 = new Student("Александр", "Губаревич", 1986, "Дрогичин", 4);
        Student student3 = new Student("Ольга", "Мазец", 1985, "Брест", 8);
        Student student4 = new Student("Юлия", "Каризна", 1986, "Марьина Горка", 10);

//1.2. Создать несколько групп. По этим группам распределить студентов. (метод коллекции add)

        Group group1 = new Group(4);
        Group group2 = new Group(5);

        group1.students.add(student1);
        group1.students.add(student2);

        group2.students.add(student3);
        group2.students.add(student4);

//1.3. Создать Факультет. Распределить туда группы. (метод коллекции add)

        Faculty faculty1 = new Faculty("ХТиТ");
        Faculty faculty2 = new Faculty("ЛесХоз");

        faculty1.groups.add(group1);
        faculty2.groups.add(group2);

        group1.removeStudentsByMark(7);

        System.out.println(group1.students);


        Group group3 = new Group(5);
        group2.transferToGroup(group3);

        System.out.println("Средняя оценка в группе " + group2.averageMarkInGroup());

        faculty1.changeStatus();
    }
}