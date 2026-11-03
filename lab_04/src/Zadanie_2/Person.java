package Zadanie_2;

public class Person {
    private String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }
}

/*
1. firstName nie jest bezpośrednio dostępne bo ma modyfikator private
2. lastName jest dostepne, poniewaz ma modyfikator protected ktory jest dostepny na poziomie dziedziczenia klas
3. Nie zawsze protected bedzie lepszym projektem, poniewaz lamie hermetyzacje i umozliwia podklasom omijanie walidacji
 */