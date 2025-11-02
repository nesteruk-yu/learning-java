package task11;

//1.2 В классе Main создайте по экземпляру объекта (РоботСапёр, роботСтроитель, РоботПовар) и вызовите метод отремантировать робота (результаты выполнения метода выведите в консоль)

public class Main {
    public static void main(String[] args) {
        RobotPovar robotPovar = new RobotPovar("F12R789", 1800, "China", "Multipekar", true);
        RobotSapper robotSapper = new RobotSapper("r456 pro max", 4500, 45, "Strelok", false);
        RobotStroitel robotStroitel = new RobotStroitel("r243dfvr90", 3400, "India", "AvtoCran", "Stal + Latun", true);


        RobotSapper robotSapper1 = new RobotSapper("r456 ultra max", 5500, 45565, "Strelok", true);
        RobotSapper robotSapper2 = new RobotSapper("r456 edition", 4990, 454, "Ubivatel", false);

        robotPovar.repair();
        robotSapper.repair();
        robotStroitel.repair();

        robotStroitel.turnOn();
        robotStroitel.turnOff();

// 1.6 Создать 3 выставки (массива) роботов в классе Main. Одна выставка будет включать в себя все виды роботов (робот-повар, робот сапёр, робот строитель). Вторая выставка- только для инженерных роботов. Третья выставка- для роботов сапёров.
//
// Продемонстрировать способности всех роботов, которые представлены на выставках (вызвать метод uniquePossibility).
// Продемонстрировать способности всех роботов-инженеров на выставке Роботов-инженеров, вызвав метод createItem на каждом Роботе, который есть на выставке.

        Robot exhibition1[] = {robotPovar, robotSapper, robotStroitel};
        RobotEngineer exhibition2[] = {robotStroitel, robotSapper};
        RobotSapper exhibition3[] = {robotSapper1, robotSapper2, robotSapper};

        System.out.println("");

        for (Robot k : exhibition1) {
            k.uniquePossibility();
        }

        for (RobotEngineer f : exhibition2) {
            f.uniquePossibility();
        }

        for (RobotSapper c : exhibition3) {
            c.uniquePossibility();
        }

        System.out.println("");
        for (RobotEngineer e : exhibition2) {
            e.createItem();
        }

    }
}
