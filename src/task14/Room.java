package task14;

//1.2 У палаты поля: номер, тип палаты (энам мужская или женская), список пациентов

import java.util.HashSet;
import java.util.Set;

public class Room {
    private int number;
    private Gender type;
    public Set<Patient> setOfPatients;

    public Room(int number, Gender type) {
        this.number = number;
        this.type = type;
        this.setOfPatients = new HashSet<>();
    }

    @Override
    public String toString() {
        return "Room " + number + type ;
    }

//1.6 Реализовать метод добавления пациента в палату на основе диагноза. Т.е, в палате должны лежать пациенты с одинаковыми диагнозами. Метод реализовать в классе Палата.

    public void addPatient(Patient patient) {
        if (setOfPatients.size() == 0) {
            setOfPatients.add(patient);
        } else {
            for (Patient p : setOfPatients) {
                if (p.getDiagnosis() == patient.getDiagnosis()) {
                    setOfPatients.add(patient);
                    break;
                }
            }
        }
    }

//1.7 В классе Палата создать метод, который будет выводить информацию по всем пациентам в палате.

    public void showPatientsInfo() {
        for (Patient p : setOfPatients) {
            System.out.println("id: " + p.getId() + ", " + "name: " + p.getName() + ", " +  "surname: " + p.getSurname() + ", " + "diagnosis: " + p.getDiagnosis() + ", " + "age: " + p.getAge() + ", " + "gender: " + p.getGender());
        };
    }
}
