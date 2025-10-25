package task9;

//1.8 * Добавить класс Лев. Лев наследуется от животного. Переопределите в нем методы, которые есть в классе Животное (издание звуков, животное играет), с указанием, что это все делает лев (пример Лев играет). Создайте пару львов и выведите их поведение в консоль. Добавить трех львов в зоопарк. У вас должно быть девять животных в зоопарке. Ещё раз пройдитесь по всем животным и вызовите методы (издание звуков, животное играет).. У вас должны вывестись соответствующие реализации для 3 собак, для трёх птиц и 3 львов (Выполнять это в методе Main)

public class Lion extends Animal {

    public Lion(String color, int maxAge, String mealType) {
        super(color, maxAge, mealType);
    }

    @Override
    public void play() {
        System.out.println("Lion is playing");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion makes RRRRRR");
    }
}
