package Zadanie_7;

public class StaticCalculator {
    private static int numberOfOperations = 0;

    public static double add(double a, double b){
        numberOfOperations++;
        return a + b;
    }

    public static double subtract(double a, double b){
        numberOfOperations++;
        return a - b;
    }

    public static double multiply(double a, double b){
        numberOfOperations++;
        return a * b;
    }

    public static int getNumberOfOperations(){
        return numberOfOperations;
    }

}

 class main {
    public static void main() {
        StaticCalculator.add(10, 5);
        StaticCalculator.subtract(20, 3);
        StaticCalculator.multiply(4, 2);

        System.out.println("Liczba operacji: " + StaticCalculator.getNumberOfOperations());
    }
}



