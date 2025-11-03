package task12;

//Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle (транспорт)
//1.1 Создать поле name и количество выбросов(Integer) в классе Vehicle и проинициализировать его через конструктора.

public class Vehicle {
    private String name;
    private int emissions;

    public Vehicle(String name, int emissions) {
        this.name = name;
        this.emissions = emissions;
    }

//1.2 Реализовать методы геттеры и сеттеры для соответствующих полей класса Vehicle

    public String getName() {
        return name;
    }

    public int getEmissions() {
        return emissions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmissions(int ejection) {
        this.emissions = ejection;
    }

}
