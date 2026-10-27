package Zadanie_5;

public class Product {
    String name;
    double price;
    static int numberOfProducts = 0;
    public static final int MAX_RRODUCTS = 100;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        if(numberOfProducts >= MAX_RRODUCTS) {
            throw new IllegalStateException("Błąd! Przekroczono dopuszczalny limit produktów.");
        }
    }


    public static int getNumberOfProducts(){
        return numberOfProducts;
    }
}


/*
1. MAX_PRODUCTS powinno być static, ponieważ określa maksymalną wartośc dla całej klasy
a nie pojedynczego obiektu.
2. Modyfikator ten tworzy stałą, zabezpieczając ustalony limit przed jakimikolwiek
zmianami w trakcie działania programu.
3. Wartość tego pola musi pozostawać modyfikowalna, ponieważ licznik jest na bieżąco
zwiększany (inkrementowany) za każdym razem, gdy pomyślnie utworzony zostaje nowy obiekt.
 */