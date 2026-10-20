public class Person {
    String name;

    public Person(String name){
        this.name = name;
    }

    public Person(Person other){
        this(other.name);
    }

    public void introduceYourself(){
        System.out.printf("Nazywam się %s\n", name);
    }
    public static void main(String[] args) {
        // Zadanie 6 - Referencja
        Person first = new Person("Anna");
        Person second = first;
        second.name = "Maria";
        first.introduceYourself();
        second.introduceYourself();
        // Zadanie 7 - Kopia
        Person third = new Person(first);
        third.name = "Kasia";
        first.introduceYourself();
        third.introduceYourself();
    }
}

/*
1. Powstał jeden obiekt Person.
2. Istnieją dwie referencje.
3. Zmiana wykonanan przez second jest widoczna również przez first,
   ponieważ second nie jest nowym, odzielnym obiektem ani jego kopią.
   Jest to druga referencja, która przechowuje adres do dokładnie tego
   samego miejsca w pamięci co zmienna first.

   Wyjaśnienie do zadania 7: "second" to tylko referencja odwołująca się
   do tego samego miejsca w pamięci, które utowrzyło "new" dla obiektu "first".
   W zadaniu 7 jest inaczej, ponieważ "third" jest nowym obiektem i korzysta
   z obiektu "first" tylko do skopiowania wartości, nie jest natomiast z nim połączony.

 */