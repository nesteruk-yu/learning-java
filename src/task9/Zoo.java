package task9;

// 1.3 Создать класс Зоопарк в котором будут жить наши животные. В качестве поля в новом классе будет массив из животных (private Animal[]animals).

// 1.4 Реализовать метод в классе зоопарк по добавлению нового животного. Сигнатура метода будет такая: public void addAnimal(Animal animal); Данный метод должен будет скопировать текущий массив с животными в новый массив с животными. Размерность нового массива должна увеличиться на 1, так как метод добавляет новое животное. Полученный массив нужно перезаписать в поле animals в классе Зоопарк.
// 1.5 Реализовать метод getAnimals в классе зоопарк который будет возвращать всех животных в зоопарке.

//1.9* Добавить поле в класс животное называемое номер (id). Присвоить уникальный номер каждому животному в зоопарке, увеличивая значение на единицу. Реализуйте метод, который будет выводить всю информацию о каждом животном в зоопарке.  Реализовать метод по удалению животного из зоопарка по номеру (id). Вывести информацию о всех животных в зоопарке.

public class Zoo {
    private Animal[] animals;

    public Zoo() {
        this.animals = new Animal[0];
    }

    public void addAnimal(Animal animal) {
        Animal[] newAnimals = new Animal[animals.length + 1];

        for (int i = 0; i < animals.length; i++) {
            newAnimals[i] = animals[i];
        }
        newAnimals[animals.length] = animal;
        animals = newAnimals;
    }

    public Animal[] getAnimals() {
        System.out.println("Animals in Zoo: " + animals.length);
        return animals;
    }

    public void printAnimals() {
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
    }
}
