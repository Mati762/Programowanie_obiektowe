class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void show() {
        System.out.println(name + ": " + price);
    }
}

public class Zadanie_11 {
    public static void main(String[] args) {
        Product product =  new Product("Monitor", 1200);

        product.show();
    }
}

/*
1. Program się nie kompiluje, ponieważ jest przed nim void przez to jest traktowany jako metoda stąd błąd o braku konstruktora, który przyjmuje dwie zmienne.
4. Słowo kluczowe "this" to referencja do obecnego obiektu. Jego rolą jest odróżnienie pola klasy od parametru konstruktora o tej samej nazwie,
co pozwala na poprawne przypisanie wartości bez konfliktu nazw.
 */