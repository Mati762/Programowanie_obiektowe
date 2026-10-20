public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void bark() {
        System.out.println("Wow Wow");
    }

    public void showInformation() {
        System.out.printf("Wabi sie: %s\n", name);
        System.out.printf("Rasa: %s\n", breed);
        System.out.printf("Piesek ma %d lat\n", age);
    }

    static void main(String[] args) {
        Dog pies1 = new Dog("Reksio", "Owczarek Niemiecki", 5);
        Dog pies2 = new Dog("Bilcia", "Chihuahua", 3);

        pies1.bark();
        pies1.showInformation();

        System.out.println();

        pies2.bark();
        pies2.showInformation();
    }
}