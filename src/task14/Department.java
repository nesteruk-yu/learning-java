package task14;

//1.3 У отделения поля: наименование отделения, список палат (коллекция Set)

import java.util.HashSet;
import java.util.Set;

public class Department {
    private String name;
    public Set<Room> listOfRooms;

    public Department(String name) {

        this.name = name;
        this.listOfRooms = new HashSet<>();
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", listOfRooms=" + listOfRooms +
                '}';
    }

//1.5 Посчитать количество мужчин и женщин в отделении.

    public int countGender(Gender gender) {
        int count = 0;
        for (Room room : listOfRooms) {
            for (Patient patient : room.setOfPatients) {
                if (patient.getGender() == gender) {
                    count++;
                }
            }
        }
        return count;
    }
}
