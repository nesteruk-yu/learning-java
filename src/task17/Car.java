package task17;

//2.1 Создать объект Автомобиль с полями (Марка автомобиля, максимальная скорость, страна производства). Переопределите метод toString(), equals(), hashcode(), гетеры и сетеры (генерируйте с помощью идеи).

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    private String brand;
    private int maxSpeed;
    private String madeInCountry;

    public Car(String brand, int maxSpeed, String madeInCountry) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.madeInCountry = madeInCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed && Objects.equals(brand, car.brand) && Objects.equals(madeInCountry, car.madeInCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, maxSpeed, madeInCountry);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getMadeInCountry() {
        return madeInCountry;
    }

    public void setMadeInCountry(String madeInCountry) {
        this.madeInCountry = madeInCountry;
    }
}
