package Zadanie_6;

public class Employee extends Person {
    private String position;

    public Employee(String firstName, String lastName, String position){
        super(firstName, lastName);
        this.position = position;
    }


    public void showInformation(){
        System.out.println("Imię: " + getFirstName());
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Stanowisko: " + position);
    }

    public String getPosition(){
        return position;
    }

    public static void main(){
        Zadanie_6.Employee pracownik = new Zadanie_6.Employee("Mateusz", "Wielk", "Kierownik");
        Manager man = new Manager("Jan","Nowak","Menager", "Ksiegowsc");

        man.showInformation();
    }



}
