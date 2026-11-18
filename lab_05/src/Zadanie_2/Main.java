package Zadanie_2;

public class Main {
        public static void main(String[] args) {
            Animal[] animals = {
                    new Dog(),
                    new Cat(),
                    new Cow(),
                    new Sheep(),
                    new Animal()
            };

            for (Animal animal : animals) {
                animal.makeSound();
            }
        }
    }

