import java.util.Scanner;
public class Zadanie_2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dodatnią liczbę całkowitą: ");
        int n = scanner.nextInt();

        if(n % 2 == 0){
            System.out.println("Liczba jest parzysta");
        }
        if (n % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 3");
        }else{
            System.out.println("Liczba nie jest podzielna przez 3");
        }
        int suma = 0;
        for (int i = 1; i <= n; i++){
             suma += i;
        }
        System.out.printf("Suma: %d\n", suma);

        int podzielne = 0;
        for (int i = 1; i <=n; i++){
            if(i % 2 == 0){
                podzielne += 1;
            }
        }
        System.out.printf("Liczb parzystych: %d\n", podzielne);

    }


}

