package Zadanie_1.animals;

public class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.printf("%s Meow\n", name);
    }

}
