package task11;

//РоботСапёр. Поля: модель, потребляемая мощность, средство для разминирования (шасси номер), материал, включение робота (boolean isOn)

public class RobotSapper implements Robot, RobotEngineer {
    private String model;
    private int power;
    private int shasseeNumber;
    private String material;
    private boolean isOn;

    public RobotSapper(String model, int power, int shasseeNumber, String material, boolean isOn) {
        this.model = model;
        this.power = power;
        this.shasseeNumber = shasseeNumber;
        this.material = material;
        this.isOn = isOn;
    }


    @Override
    public void repair() {
        System.out.println("Repair RobotSapper");
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
        System.out.println("Robot is shooting");
    }

    @Override
    public void createItem() {
        System.out.println("Sozdaet prisposoblenie dlya razminirovaniya");
    }
}
