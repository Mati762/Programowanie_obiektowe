import java.util.Scanner;

public class Zadanie_dodatkowe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        int odwrocona = 0;

        while (liczba > 0) {
            int cyfra = liczba % 10;
            odwrocona = odwrocona * 10 + cyfra;
            liczba /= 10;
        }

        System.out.println("Odwrócona liczba: " + odwrocona);

        scanner.close();
    }
}