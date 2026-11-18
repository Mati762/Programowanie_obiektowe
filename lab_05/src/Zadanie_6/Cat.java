package Zadanie_6;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Miau miau!");
    }

    public void climb() {
        System.out.println("Kot wspina sie na drzewo!");
    }
}