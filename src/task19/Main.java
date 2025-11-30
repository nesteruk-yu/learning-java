package task19;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringHandler lyanbda = s -> s.toUpperCase();
        System.out.println(lyanbda.handle("я молодец"));
    }

//1.1. Создать города
    List<City> cities = List.of(
        new City(1, "Tokyo", 3700000, Continent.ASIA),
        new City(2, "Delhi", 31000000, Continent.ASIA),
        new City(3, "Minsk", 2000000, Continent.EUROPE),
        new City(4, "Oslo", 700000, Continent.EUROPE),
        new City(5, "New York", 19000000, Continent.NORTH_AMERICA),
        new City(6, "Mexico", 22000000, Continent.NORTH_AMERICA)
    );

//1.2. Найти самый густонаселённый город на континенте (filter по континенту+ max)
    City maxAsia = cities.stream()
            .filter(c -> c.getContinent() == Continent.ASIA)
            .max(Comparator.comparingInt(City::getPopulation))
            .orElse(null);

//1.3. Найти город, с минимальным населением на континенте. (filter по континенту+ min)
    City minEurope = cities.stream()
            .filter(c -> c.getContinent() == Continent.EUROPE)
            .min(Comparator.comparingInt(City::getPopulation))
            .orElse(null);

//1.4. Найти самый густонаселённый город (max)
    City maxWorld = cities.stream()
            .max(Comparator.comparingInt(City::getPopulation))
            .orElse(null);

//1.5. Найти город с самым маленьким населением. (min)
    City minWorld = cities.stream()
            .min(Comparator.comparingInt(City::getPopulation))
            .orElse(null);

//1.6. Найти первый попавшиеся город, у которого население больше 1млн. (filter + findFirst).
    City firstBig = cities.stream()
            .filter(c -> c.getPopulation() > 1000000)
            .findFirst()
            .orElse(null);

//1.7. Отобрать города с населением больше 1 млн. (filter)
    List<City> bigCities = cities.stream()
            .filter(c -> c.getPopulation() > 1000000)
            .toList();

//1.8. Создать коллекцию из названий городов, на основании объектов (map)
    List<String> names = cities.stream()
            .map(City::getName)
            .toList();
}
