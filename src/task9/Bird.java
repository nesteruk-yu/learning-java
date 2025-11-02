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
    public void play(){
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

}
