public class Book {
    String title;
    String author;
    int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public Book(String title, String author) {
        this(title, author, 2000);
    }

    public Book() {
        this("Nieznany", "Nieznany", 2000);
    }

    public static void main(String[] args) {
        Book ksiazka1 = new Book();
        Book ksiazka2 = new Book("Wiedźmin Krew Elfów", "Andrzej Sapkowski");
        Book ksiazka3 = new Book("QUA VAIDIS", "Andrzej Dragan", 2025);

        System.out.printf("Książka 1: %s, autor: %s, rok wydania: %d\n", ksiazka1.title, ksiazka1.author, ksiazka1.publicationYear);
        System.out.printf("Książka 2: %s, autor: %s, rok wydania: %d\n", ksiazka2.title, ksiazka2.author, ksiazka2.publicationYear);
        System.out.printf("Książka 3: %s, autor: %s, rok wydania: %d\n", ksiazka3.title, ksiazka3.author, ksiazka3.publicationYear);

    }
}