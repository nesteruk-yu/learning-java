package task12;

//1.5 Класс Main. Создать 2 объекта класса Garage. Вывести на экран имя хранимого транспортного средства и проверить разрешён ли въезд транспортного средства в гараж.

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Opel", 23);

        Motorcycle motorcycle1 = new Motorcycle("BMW", 456);

        Garage<Car> carGarage = new Garage<> (car1);
        Garage<Motorcycle> motorcycleGarage = new Garage<> (motorcycle1);

        System.out.println(carGarage.getVehicle().getName());
        System.out.println(motorcycleGarage.getVehicle().getName());

        System.out.println(carGarage.isEntryPermitted());
        System.out.println(motorcycleGarage.isEntryPermitted());


    }
}
