package Zadanie_02;


public class Person2{
    private String name;
    private int age;
    private String email;

    public Person2(String name, int age, String email){
        if(name != null) {
            this.name = name;
        }else{
            System.out.println("Błąd! To pole nie może być puste.");
        }
        if(age >= 0 && age <= 150) {
            this.age = age;
        }else{
            System.out.println("Błąd! Wiek musi być w przedziale 0-150.");
        }
        if(email.contains("@")) {
            this.email = email;
        }else{
            System.out.println("Błąd! Email musi zawierać znak @.");
        }
    }

    public String getname(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        if(email.contains("@")){
            this.email = email;
        } else{
            System.out.println("Błąd! Email musi zawierać znak @.");
        }
    }
}
