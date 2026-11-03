package Zadanie_8;

public class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString(){
        return "Book{title = '%s', author = '%s', year = '%d'}"
                .formatted(this.title, this.author, this.publicationYear);
    }

    public static void main(String[] args){
        Book book = new Book("Wiedzmin", "Andrzej Sapkowski", 2007);
        System.out.println(book);
        System.out.println(book.getClass());
    }

}
