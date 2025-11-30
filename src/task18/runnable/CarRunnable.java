package task18.runnable;

//1.Создать класс авто. Поля в классе будут: имя машины, гос. номер, время остановки. Определить в нём метод, при котором авто будет просто ехать (выводить в консоль сообщение в цикле).
//1.1 Создать два потока (две машины которые будут ехать параллельно). Потоки запускайте в классе Main. Выносите методы в private static void согласно заданиям.
//1.2 Дать возможность каждой машине останавливаться на определённое время. (метод sleep). Передавать в конструктор параметр по остановке, которое будет записываться в поле (время остановки). В последствии поток будет спать переданное время.
//1.3 Запустить три потока с машинами. При этом 2 машины начнут двигаться только после того, как 1 машина прекратит езду (прекратит выполнение потока) (метод join)
//1.4 Сделать задачу 1.1 и 1.2 через интерфейс Runnable. Для этого создайте в пакете с домашнем заданием, пакет с названием runnable.  В этом пакете реализуйте (скопируйте) класс Авто с последующем изменением.

public class CarRunnable extends Thread {
    private String name;
    private String gosNumber;
    private int stopTime;

    public CarRunnable(String name, String gosNumber, int stopTime) {
        this.name = name;
        this.gosNumber = gosNumber;
        this.stopTime = stopTime;
    }

    @Override
    public void run() {
        moveCar();
    }

    public void moveCar() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " (" + gosNumber + ") едет...");

            try {
                System.out.println(name + " остановился на " + stopTime/1000 + " сек.");
                Thread.sleep(stopTime);
                System.out.println(name + " продолжает движение");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
