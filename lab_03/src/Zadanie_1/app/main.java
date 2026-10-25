package Zadanie_1.app;
import Zadanie_1.animals.Cat;
import Zadanie_1.animals.Dog;
import Zadanie_02.Person2;


public class main {
    public static void main() {
        Cat kotek = new Cat("Miauczek", 18);
        Dog psinka = new Dog("Simba", 5);

        kotek.makeSound();
        psinka.makeSound();

        /*    Test do zadania 2
        Person2 kelner = new Person2("Mateusz", 20, "jazda@gmail.com");
        System.out.printf("Wiek kelnera: %d", kelner.getAge());
         */
    }
}
