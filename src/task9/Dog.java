package task9;

public class Dog extends Animal {
    private String name;
    private String poroda;
    private int averageWeight;

    public Dog(String color, int maxAge, String mealType, String name, String poroda, int averageWeight) {
        super(color, maxAge, mealType);
        this.name = name;
        this.poroda = poroda;
        this.averageWeight = averageWeight;
    }

    public void layat() {System.out.println(this.name + " laet"); }

    public void kusat() {
        System.out.println(this.name + " kusaet");
    }

    public void begat() {
        System.out.println(this.name + " begaet");
    }

    public void igrat() {
        System.out.println(this.name + " igraet");
    }

    public void prygat() {
        System.out.println(this.name + " prygaet");
    }

    @Override
    public void play() {
        System.out.println(this.name + " playing");
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " voet");
    }

    @Override
    public String toString() {
        return "собака " + name + ", порода, " + "средний вес " + averageWeight;
    }

    @Override
    public boolean equals(Object o) {
        Dog dog = (Dog) o;
        return name == dog.name &&
                poroda == dog.poroda &&
                averageWeight == dog.averageWeight &&
                super.getColor() == dog.getColor() &&
                super.getMaxAge() == dog.getMaxAge() &&
                super.getMealType() == dog.getMealType();
    }

    @Override
    public int hashCode() {
       return poroda.hashCode() + super.getColor().hashCode();
    }
}
