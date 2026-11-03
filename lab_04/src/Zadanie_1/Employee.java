package Zadanie_1;

import Zadanie_2.Person;

public class Employee extends Person {
    private String position;

    public Employee(String firstName, String lastName, String position){
        super(firstName, lastName);
        this.position = position;
    }


    public void displayData(){
        System.out.println("Imię: " + getFirstName());
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Stanowisko: " + position);
    }

    public static void main(){
        Employee pracownik = new Employee("Mateusz", "Wielk", "Kierownik");
        pracownik.displayData();
    }



}
