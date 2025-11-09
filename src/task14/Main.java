package task14;

public class Main {
    public static void main(String[] args) {

//1.4 Создать пациентов. Распределить их по палатам. В одной палате по 3 пациента максимум. При этом попробуйте добавить двух пациентов, с одинаковыми полями. Если количество пациентов в палате увеличилось, значит неправильно реализованы equals и hashСode. Палаты распределить по отделениям.

        Patient patient1 = new Patient(1, "Ivan", "Ivanov", "ORVI", 37, Gender.MALE);
        Patient patient2 = new Patient(2, "Sergey", "Dulgery", "ALKASH", 40, Gender.MALE);
        Patient patient3 = new Patient(3, "Olga", "Mazec", "ORVI", 39, Gender.FEMALE);
        Patient patient4 = new Patient(4, "Veronika", "Slavovna", "POEHALA KRYSHA", 33, Gender.FEMALE);
        Patient patient5 = new Patient(5, "Fedor", "Fedorov", "CIROZ PECHENI", 45, Gender.MALE);
        Patient patient6 = new Patient(5, "Fedor", "Fedorov", "CIROZ PECHENI", 45, Gender.MALE);


        Room room1 = new Room(5, Gender.FEMALE);
        Room room2 = new Room(6, Gender.MALE);
        Room room3 = new Room(7, Gender.MALE);

        room1.setOfPatients.add(patient1);
        room2.setOfPatients.add(patient2);
        room2.setOfPatients.add(patient3);

        System.out.println("Room 1: " + room1.setOfPatients);
        System.out.println("Room 2: " + room2.setOfPatients);

        room3.setOfPatients.add(patient4);
        room3.setOfPatients.add(patient5);
        room3.setOfPatients.add(patient6);

        System.out.println("Room 3: " + room3.setOfPatients);

        Department department1 = new Department("Hirurgia");
        Department department2 = new Department("Terapevticheskoe");

        department1.listOfRooms.add(room1);
        department1.listOfRooms.add(room2);
        department2.listOfRooms.add(room3);

        for (Room room : department1.listOfRooms){
            System.out.println("department1 " + room.setOfPatients);
        }

        for (Room room : department2.listOfRooms){
            System.out.println("department2: " + room.setOfPatients);
        }

        System.out.println(department1.countGender(Gender.MALE));

        System.out.println("room1 до " + room1.setOfPatients);
        room1.addPatient(patient3);
        System.out.println("room1 после " + room1.setOfPatients);

        room2.showPatientsInfo();

    }
}
