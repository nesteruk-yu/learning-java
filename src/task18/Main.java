package task18;

import task18.runnable.CarRunnable;

public class Main {
    public static void main(String[] args) {
        runTwoCars();
        runTreeCars();
        runCarRunnable();
    }

    private static void runTwoCars() {
        Car car1 = new Car("BMW", "1111 AA-1", 5000);
        Car car2 = new Car("Audi", "2222 BB-2", 2000);

        car1.start();
        car2.start();
    }


    private static void runTreeCars() {
        Car car1 = new Car("Tesla", "3333 CC-3", 6000);
        Car car2 = new Car("Ford", "4444 DD-4", 5000);
        Car car3 = new Car("Mazda", "5555 EE-5", 4000);

        car1.start();
        try {
            car1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        car2.start();
        car3.start();
    }

    private static void runCarRunnable() {
        Thread t1 = new Thread(new CarRunnable("VW", "7777 FF-7", 500));
        Thread t2 = new Thread(new CarRunnable("Skoda", "8888 GG-8", 600));
        t1.start();
        t2.start();
    }
}