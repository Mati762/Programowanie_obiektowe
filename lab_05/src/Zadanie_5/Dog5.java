package Zadanie_5;

public class Dog5 extends Animal5 {
    public String breed = "Owczarek";

    @Override
    public void makeSound() {
        System.out.println("Hau hau!");
    }

    public void fetch() {
        System.out.println("Pies aportuje!");
    }
}