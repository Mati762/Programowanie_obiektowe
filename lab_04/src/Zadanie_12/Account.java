package Zadanie_12;

public class Account {
    private String imie;
    private String nazwisko;
    private int rokUrodzenia;

    public Account(String imie, String nazwisko, int rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public void info(){
        System.out.println("Imie: " + getImie());
        System.out.println("Nazwisko: " + getNazwisko());
        System.out.println("Rok urodzenia: " + getRokUrodzenia());

    }

}
