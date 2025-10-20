package task8;

public class Main {

    //1.3 В методе main вызовите этот метод, передайте любые строки, в качестве аргументов и выведите результат вконсоль.
    public static void main(String[] args) {
        String1 input = new String1();
        String resultInput = input.returnString("абра кадабра", "када");
        System.out.println(resultInput);

        String1 text = new String1();
        String resultText = text.cutText(3, "strings");
        System.out.println(resultText);
    }

}