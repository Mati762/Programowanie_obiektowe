package Zadanie_6;

public class Main {
    public static void main(String[] args) {
        Animal first = new Dog();
        Animal second = new Cat();

        if (first instanceof Dog) {
            Dog dog = (Dog) first;
            dog.digHole();
        }

        if (second instanceof Cat) {
            Cat cat = (Cat) second;
            cat.climb();
        }

        System.out.println("\nProba niebezpiecznego rzutowania:");
        Dog dog = (Dog) second;
    }
}