package Zadanie_3;

import Zadanie_2.*;

public class Main {

    public static void present(Animal animal) {
        System.out.println(animal);
        animal.makeSound();
    }

    public static void main(String[] args) {
        present(new Dog());
        present(new Cat());
        present(new Cow());
    }
}