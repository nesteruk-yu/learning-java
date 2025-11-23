package task17;

//Дан текст: The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him.

import java.io.*;

public class Main {
    static String text = "The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him.";

    public static void main(String[] args) {
//        writeRelative(text);
//        writeAbsolute(text);
//        readRelative();
//        readAbsolute();

// В классе Main создать объект автомобиль.
        Car car = new Car("Ford", 280, "USA");

//        serializeCar(car);
        Car car1 = deserializeCar();
        System.out.println(car1.getBrand());
    }

//1.1 Записать его в файл, прописав относительный путь. Реализуйте соответствующий метод в классе Main.

    public static void writeRelative(String text) {
        File file = new File("File.text");

        try {
            FileWriter fw = new FileWriter(file);
            fw.write(text);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //1.2 Записать его в файл прописав абсолютный путь. Реализуйте соответствующий метод в классе Main
//    /Users/julia.n/Documents/workspace/learning-java
    public static void writeAbsolute(String text) {
        File file = new File("/Users/julia.n/Documents/workspace/learning-java/File1.text");

        try {
            FileWriter fw = new FileWriter(file);
            fw.write(text);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//1.3 Вычитать текст из первого файла. Реализуйте соответствующий метод в классе Main

    public static void readRelative() {

        try {
            FileReader fr = new FileReader("File.text");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }

    }

    //1.4 Вычитать текст из второго файла Реализуйте соответствующий метод в классе Main

    public static void readAbsolute() {
        try {
            FileReader fr = new FileReader("/Users/julia.n/Documents/workspace/learning-java/File1.text");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }

// Выполнить сериализацию объекта. Реализуйте соответствующий метод в классе Main

    public static void serializeCar(Car car) {
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("car.ser"));
            oos.writeObject(car);
        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }

//2.2 Выполнить десериализацию автомобиля и вывести его в консоли. Реализуйте соответствующий метод в классе Main

    public static Car deserializeCar() {
        Car car = null;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("car.ser"));
            car = (Car) ois.readObject();
        } catch (IOException e) {
            System.out.println("Error writing file");
        } catch (ClassNotFoundException e) {
            System.out.println("Error writing file");
        }
        return car;
    }
}
