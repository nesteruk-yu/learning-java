package task14;

//1. Создать класс пациент, палата, отделение.
//1.1 У пациента поля: уникальный идентификатор, имя, фамилия, диагноз, возраст, пол (сделать enum класс: Мужской, Женский).

//1.8*. Сортировать пациентов по идентификационному номеру. (коллекция TreeSet, интерфейс Comparable) Для этого в классе Палата пациенты должны лежать в коллекции TreeSet. А класс пациент должен имплементировать интерфейс Comparable

import java.util.Objects;

public class Patient {
    private int id;
    private String name;
    private String surname;
    private String diagnosis;
    private int age;
    private Gender gender;

    public Patient(int id, String name, String surname, String diagnosis, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.diagnosis = diagnosis;
        this.age = age;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDiagnosis() {
        return this.diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        Patient patient = (Patient) o;
        if (this.id == patient.getId() && this.name == patient.getName() && this.surname == patient.getSurname() && this.diagnosis == patient.getDiagnosis() && this.age == patient.getAge() && this.gender == patient.getGender()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, gender);
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + diagnosis;
    }
}
