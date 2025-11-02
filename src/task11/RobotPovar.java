package task11;

//РоботПовар поля: модель, потребляемая мощность, страна производитель, агрегат для приготовления, включение робота (boolean isOn).

public class RobotPovar implements Robot {
    private String model;
    private int power;
    private String madeByCountry;
    private String cookMachine;
    private boolean isOn;

    public RobotPovar(String model, int power, String madeByCountry, String cookMachine, boolean isOn) {
        this.model = model;
        this.power = power;
        this.madeByCountry = madeByCountry;
        this.cookMachine = cookMachine;
        this.isOn = isOn;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Robot is turned on");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Robot is turned off");
    }

    @Override
    public void uniquePossibility() {
        System.out.println("Robot is cooking");
    }
}
