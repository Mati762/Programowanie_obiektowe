class Film {
    String tytul;
    String gatunek;
    double czas_trwania;
    int kategoria_wiek;

    public Film(String tytul, String gatunek, double czas_trwania, int kategoria_wiek) {
        this.tytul = tytul;
        this.gatunek = gatunek;
        this.czas_trwania = czas_trwania;
        this.kategoria_wiek = kategoria_wiek;
    }

    public void showInformation() {
        System.out.printf("Tytuł: %s\n Gatunek: %s\n Czas trwania: %.2f min\n Kategoria wiekowa: %d\n", tytul, gatunek, czas_trwania, kategoria_wiek);
    }
}

class Sala{
    int numer_sali;
    int liczba_rzedow;
    int miejsca_w_rzedzie;
    int liczba_miejsc;

    public Sala(int numer_sali, int liczba_rzedow, int miejsca_w_rzedzie){
        this.numer_sali = numer_sali;
        this.liczba_rzedow = liczba_rzedow;
        this.miejsca_w_rzedzie = miejsca_w_rzedzie;
        this.liczba_miejsc = liczba_rzedow * miejsca_w_rzedzie;
    }

    public boolean czyMiejsceIstnieje(int wybrany_rzad, int wybrane_miejsce) {
        return wybrany_rzad > 0 && wybrany_rzad <= liczba_rzedow &&
                wybrane_miejsce > 0 && wybrane_miejsce <= miejsca_w_rzedzie;
    }

    public void showSala(){
        System.out.printf("Numer sali: %d\n Pojemność: %d osób (%d rzędów po %d miejsc)\n",
                numer_sali, liczba_miejsc, liczba_rzedow, miejsca_w_rzedzie);
    }

}

class Seans{
    String data_godzina;
    Film przypisany_film;
    Sala przypisana_sala;

    public Seans(String data_godzina, Film przypisany_film, Sala przypisana_sala){
        this.data_godzina = data_godzina;
        this.przypisany_film = przypisany_film;
        this.przypisana_sala = przypisana_sala;
    }

    public void dane(){
        System.out.printf("SEANS: %s\n", data_godzina);
        przypisany_film.showInformation();
        przypisana_sala.showSala();
    }

}


public class Zadanie_12 {
    public static void main(String[] args){
        Film film = new Film("Wyspa Tajemnic", "Thiller", 2.18, 18);
        Sala sala = new Sala(1, 5, 10);
        Seans seans = new Seans("20.10.2026 14:00", film, sala);

        seans.dane();
    }

}
