import java.util.Scanner;

public class Zadanie_4 { //błąd wykryty przez kompilator, nazwa klasy publicznej musi byc zgodna z nazwem pliku

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //błąd wykryty przez kompilator, brak ";" na końcu lini

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) { // błąd wykryty przez kompilator, jedno = przypisuje wartość do zmiennej, podwójny znak równości służy do porównywania
            System.out.println("Liczba jest parzysta");
        }
        else {
            System.out.println("Liczba jest nieparzysta"); //błąd wykryty przez kompilator, brak ";" na końcu lini
        }

        for (int i = 0; i <= 5; i++) { // błąd wykryty dopiero po uruchomieniu, chociaż wcześniej czytając kod widzimy, że pętla jest bez sensu, musimy ustawić i++, ponieważ zmniejszając wartość nigdy nie spełnimy zatrzymania warunku zakończenia działania pętli
            System.out.println(i);
        }

        scanner.close();
    }
}