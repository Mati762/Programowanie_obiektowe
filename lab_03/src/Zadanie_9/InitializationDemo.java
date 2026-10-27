package Zadanie_9;

public class InitializationDemo {

    private static int staticField = initStaticField();

    static {
        System.out.println("Blok statyczny");
    }

    private int instanceField = initInstanceField();

    {
        System.out.println("Blok instancyjny");
    }

    public InitializationDemo() {
        System.out.println("Konstruktor");
    }

    private static int initStaticField() {
        System.out.println("Statyczne pole");
        return 1;
    }

    private int initInstanceField() {
        System.out.println("Pole instancji");
        return 1;
    }
}

class main {
    public static void main(String[] args) {
        System.out.println("--- Obiekt 1 ---");
        new InitializationDemo();

        System.out.println("--- Obiekt 2 ---");
        new InitializationDemo();
    }
}