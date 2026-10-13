import java.util.Scanner;

public class Zadanie_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tablica = new int[10];
        int suma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Podaj liczbe całkowitą: ");
            tablica[i] = scanner.nextInt();
            suma += tablica[i];
        }

        int najmniejsza = tablica[0];
        int najwieksza = tablica[0];

        for (int i = 1; i < 10; i++) {
            if (tablica[i] < najmniejsza) {
                najmniejsza = tablica[i];
            }
            if (tablica[i] > najwieksza) {
                najwieksza = tablica[i];
            }
        }

        float srednia_arytmetyczna = (float) suma / 10;

        int wieksze_od_sredniej = 0;

        for (int i = 0; i < 10; i++) {
            if (tablica[i] > srednia_arytmetyczna) {
                wieksze_od_sredniej++;
            }
        }

        System.out.printf("Najwieksza wartosc wynosi: %d\n", najwieksza);
        System.out.printf("Najmniejsza wartosc wynosi: %d\n", najmniejsza);
        System.out.printf("Suma wynosi: %d\n", suma);
        System.out.printf("Srednia wynosi: %f\n", srednia_arytmetyczna);
        System.out.printf("Liczb wiekszych od sredniej: %d\n", wieksze_od_sredniej);
    }
}