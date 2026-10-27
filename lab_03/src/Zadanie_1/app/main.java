package Zadanie_1.app;
import Zadanie_1.animals.Cat;
import Zadanie_1.animals.Dog;
import Zadanie_02.Person2;
import Zadanie_3.BankAccount;
import Zadanie_4.ExamResults;
import java.util.Arrays;
import Zadanie_5.Product;

public class main {
    public static void main() {
        Cat kotek = new Cat("Miauczek", 18);
        Dog psinka = new Dog("Simba", 5);

        kotek.makeSound();
        psinka.makeSound();

        /*
        - TEST ZADANIA 2 -
        Person2 kelner = new Person2("Mateusz", 20, "jazda@gmail.com");
        System.out.printf("Wiek kelnera: %d", kelner.getAge());

        - TEST ZADANIA 3 -

        BankAccount konto = new BankAccount("Jan Kowalski", 500);
        System.out.printf("STAN KONTA: %.3f\n", konto.getBalance());
        konto.deposit(200);
        System.out.printf("STAN KONTA: %.3f\n", konto.getBalance());
        konto.withdraw(300);
        System.out.printf("STAN KONTA: %.3f\n", konto.getBalance());

        - TEST ZADANIA 4 -
        int[] originalArray = {10, 20, 30};
        ExamResults results = new ExamResults(originalArray);

        System.out.println("Stan początkowy: " + Arrays.toString(results.getPoints()));
        originalArray[0] = 100;
        System.out.println("Po zmianie oryginalnej tablicy: " + Arrays.toString(results.getPoints()));

        - TEST ZADANIA 5 -
        Product piwo = new Product("Harnaś", 4);
        System.out.printf("Liczba produktów to: %d", piwo.getNumberOfProducts());
        */

    }
}
