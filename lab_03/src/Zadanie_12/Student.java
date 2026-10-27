package Zadanie_12;

public class Student {
    private String name;
    private String albumNumber;

    public Student(String name, String albumNumber) {
        if (name == null) {
            throw new IllegalArgumentException("Imię i nazwisko nie może być puste.");
        }
        if (albumNumber == null) {
            throw new IllegalArgumentException("Numer albumu musi zawierać dokładnie 6 cyfr.");
        }
        this.name = name;
        this.albumNumber = albumNumber;
    }

    public String getName() {
        return name;
    }

    public String getAlbumNumber() {
        return albumNumber;
    }
}