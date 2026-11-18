package Zadanie_4;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Developer("Jan", 8000, 2000),
                new Tester("Anna", 6000, 10, 50),
                new Manager("Piotr", 12000, 3000),
                new Administrator("Marek", 7000, 1500)
        };

        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - Wynagrodzenie: " + emp.calculateSalary() + " zł");
        }
    }
}