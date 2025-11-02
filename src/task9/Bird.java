package task9;

public class Bird extends Animal {
    private String family;
    private int maxHeight;

    public Bird(String color, int maxAge, String mealType, String family, int maxHeight) {
        super(color, maxAge, mealType);
        this.family = family;
        this.maxHeight = maxHeight;
    }

    public void pet() {
        System.out.println(this.family + " poet");
    }

    public void klevat() {
        System.out.println(this.family + " klyuet");
    }

    public void sitOnEggs() {
        System.out.println(this.family + " vysijivaet ptentsov");
    }

    @Override
    public void play() {
        System.out.println(this.family + " playing");
    }

    @Override
    public void makeSound() {
        System.out.println(this.family + " chirikaet");
    }

    @Override
    public String toString() {
        return "птица семейства " + family + ", максимальная высота полета " + maxHeight;
    }

//1. Переопределить метод equals и hashcode в классах Птица и Собака из предыдущего задания.

    @Override
    public boolean equals(Object o) {
        Bird bird = (Bird) o;
        return family == bird.family &&
                maxHeight == bird.maxHeight &&
                super.getColor() == bird.getColor() &&
                super.getMaxAge() == bird.getMaxAge() &&
                super.getMealType() == bird.getMealType();
    }

    @Override
    public int hashCode() {
        return family.hashCode() + super.getMaxAge();
    }
}
