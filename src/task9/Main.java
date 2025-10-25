package task9;

public class Main {
    public static void main(String[] args) {

// 1.1 Создать по объекту соответствующих классов продемонстрировать поведение собак и птиц. (вызвать соответствующие методы в классах собака и птица)
// 1.2 Реализовать метод, который будет выводить информацию о собаке, птице, животном (toString)

        Dog dog = new Dog("Pesochnuy", 3, "Royal Canin", "Puhlya", "Shpits", 4);
        Bird bird = new Bird("Seruy", 3, "Zerno", "Utochnoe", 6);

        dog.begat();
        dog.layat();
        dog.igrat();
        dog.kusat();
        dog.prygat();

        bird.klevat();
        bird.pet();
        bird.sitOnEggs();

//1.6 Используя метод по добавлению животного в зоопарк (п.1.4) добавить по три собаки и по три птицы. (Выполнять это в методе Main, создав соответствующие объекты зоопарка, птиц, собак и т.д.)

        Dog dog1 = new Dog("black", 6, "Wiskas", "Filya", "Pekines", 8);
        Dog dog2 = new Dog("White", 8, "Corm", "Pulya", "Buldog", 12);

        Bird bird1 = new Bird("Pink", 3, "Grass & crabs", "Flamingovoe", 10);
        Bird bird2 = new Bird("Black", 8, "Trash", "Voronovoe", 6);

        Lion lion = new Lion("Orange", 9, "myasoed");
        Lion lion1 = new Lion("Grey", 3, "myasoed");
        Lion lion2 = new Lion("Black", 13, "myasoed");

        Zoo zoo = new Zoo();

        zoo.addAnimal(dog);
        zoo.addAnimal(dog1);
        zoo.addAnimal(dog2);

        zoo.addAnimal(bird);
        zoo.addAnimal(bird1);
        zoo.addAnimal(bird2);

        zoo.addAnimal(lion);
        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);

        zoo.getAnimals();
        zoo.printAnimals();
        
// 1.7 Получить всех животных из зоопарка. Пройтись по всем животным в зоопарке и вызвать методы (издание звуков, животное играет). У вас должны вывестись соответствующие реализации для 3 собак и для трёх птиц(Выполнять это в методе Main)

        for (Animal a : zoo.getAnimals()) {
            a.makeSound();
            a.play();
            System.out.println();
        }
    }
}
