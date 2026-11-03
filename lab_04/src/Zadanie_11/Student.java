package Zadanie_11;

public class Student extends Person {

    private int albumNumber;

    public Student(String name, int albumNumber) {
        super(name);
        this.albumNumber = albumNumber;
    }

    public int getAlbumNumber() {
        return albumNumber;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Number albumu: " + getAlbumNumber());
    }
}

/*
1. W konstruktorze nie było przypisania dla klasy glownej, dodalem 'super'
2. Brak gettera dla prywatnego pola albumNumber
3. Brak '@Override' oraz nadpisania metody poprzez 'super'

 */