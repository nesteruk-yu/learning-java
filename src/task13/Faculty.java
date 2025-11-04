package task13;

//У факультета: наименование факультета, список групп (List<Group> groups. )

import java.util.ArrayList;
import java.util.List;

public class Faculty {

//1.7*. Добавить поле для факультета энамовского типа: ACTIVE (Активный) и NOT_ACTIVE (Неактивный факультет). Реализовать геттеры и сеттеры.

    public enum FacultyStatus {
        ACTIVE,
        NOT_ACTIVE,
    }

    private String facultyName;
    public List<Group> groups;
    private FacultyStatus status;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
        groups = new ArrayList<>();
    }

//Реализовать во всех классах методы геттеры и сеттеры

    public FacultyStatus getStatus() {
        return this.status;
    }

    public void setStatus(FacultyStatus status) {
        this.status = status;
    }

    public String getFacultyName() {
        return this.facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public List<Group> getGroups() {
        return this.groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

//1.8* Реализовать метод по смене статуса факультета: Если общее количество студентов на факультете меньше 20-сделать факультет неактитвным. (Метод size() в коллекции)

    public void changeStatus() {
        if (this.groups.size() < 20) {
            System.out.println("Статус факультета не активный");
            this.status = FacultyStatus.NOT_ACTIVE;
        }
    }
}