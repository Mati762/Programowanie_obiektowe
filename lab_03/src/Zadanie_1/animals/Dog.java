package Zadanie_1.animals;

public class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
            System.out.printf("%s Woof Woof\n", name);
    }


}