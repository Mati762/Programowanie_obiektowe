package Zadanie_7;

public class Main7 {
    public static void specialAction(Animal animal) {
        if (animal instanceof Dog dog) {
            dog.digHole();
        } else if (animal instanceof Cat cat) {
            cat.climb();
        }
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        specialAction(dog);
        specialAction(cat);
    }
}