package Zadanie_5;

public class Main5 {
    public static void main(String[] args) {
        Dog5 dog = new Dog5();
        Animal5 animal = dog;

        dog.makeSound();
        dog.fetch();
        System.out.println("Pies breed: " + dog.breed);
        System.out.println("Pies name: " + dog.name);

        animal.makeSound();
        // animal.fetch();
        System.out.println("Animal name: " + animal.name);

        dog.name = "Reksio";
        System.out.println("Odczyt name przez animal: " + animal.name);
    }
}