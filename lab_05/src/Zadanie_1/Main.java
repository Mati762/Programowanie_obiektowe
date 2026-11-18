package Zadanie_1;

public class Main {
    public static void main(String[] args) {
        Animal first = new Dog();
        Animal second = new Cat();

        first.makeSound();
        second.makeSound();
    }
}

// Typ referencji - Animal
// Typ obiektu Dog
// Zostanie wykonana wersja makeSound() z klasy Dog
// Nie, przez first nie można bezpośrednio wywołać metody występującej wyłącznie w Dog bez wcześniejszego rzutowania (np. ((Dog) first).metodaPsa()), ponieważ typem referencji jest Animal