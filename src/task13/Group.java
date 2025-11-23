package task13;

import java.util.ArrayList;
import java.util.List;

//У группы: номер группы, коллекция студентов (List<Student> students)
public class Group {
    private int numberOfGroup;
    public List<Student> students;

    public Group(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
        this.students = new ArrayList<>();
    }


//Реализовать во всех классах методы геттеры и сеттеры

    public int getNumberOfGroup() {
        return this.numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

//1.4. Реализовать метод в классе Group, который должен пройти по всем студентам в группе и удалить тех, у кого средний бал ниже переданной оценки в параметре метода. (метод remove). Сигнатура метода: public void removeStudentsByMark(int mark);

    public void removeStudentsByMark(int mark) {
        List<Student> studentsToRemove = new ArrayList<>();
        for (Student student : this.students) {
            if (student.averageMark < mark) {
                studentsToRemove.add(student);
            }
        }

        for (Student student : studentsToRemove) {
            this.students.remove(student);
        }
    }

//1.5. Реализовать метод, если в группе меньше 2 человек, перевести этих студентов в другую группу. (методы коллекций size(), addAll()); Сигнатура метода: public void transferToGroup(Group newGroup);

    public void transferToGroup(Group newGroup){
        if (this.students.size() < 2) {
            newGroup.students.addAll(this.students);
            System.out.println("В группе меньше 2 студентов");
        } else {
            System.out.println("В группе 2 или больльше студентов");
        }
    }

//1.6. Реализовать метод в классе Group, который считает средний бал по группе. Сигнатуру и название придумайте сами.

    public int averageMarkInGroup(){
        int mark = 0;
        for (Student student : this.students) {
            mark += student.averageMark;
        }
        mark = mark / this.students.size();
        return mark;
    }
}