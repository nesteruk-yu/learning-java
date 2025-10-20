package task8;

public class Main {

    //1.3 В методе main вызовите этот метод, передайте любые строки, в качестве аргументов и выведите результат вконсоль.
    public static void main(String[] args) {
        Task8 input = new Task8();
        String resultInput = input.returnString("абра кадабра", "када");
        System.out.println(resultInput);

        Task8 text = new Task8();
        String resultText = text.cutText(3, "strings");
        System.out.println(resultText);
    }

}