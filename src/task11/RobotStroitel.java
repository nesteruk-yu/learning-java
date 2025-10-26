package task11;

//РоботСроитель. Поля: модель, потребляемая мощность, страна производитель, агрегат для строительства, материал, включение робота (boolean isOn.)

public class RobotStroitel implements Robot, RobotEngineer {
    private String model;
    private int power;
    private String madeByCountry;
    private String buildMachine;
    private String material;
    private boolean isOn;

    public RobotStroitel(String model, int power, String madeByCountry, String buildMachine, String material, boolean isOn) {
        this.model = model;
        this.power = power;
        this.madeByCountry = madeByCountry;
        this.buildMachine = buildMachine;
        this.material = material;
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
        System.out.println("Robot is building");
    }

    @Override
    public void createItem() {
        System.out.println("Robot meshaet beton");
    }
}
