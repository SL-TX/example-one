package ru.skypro;
//@AllArgsConstructor
//@Getter
public class Book {
    private String name;
    private Author author;
    //@Setter
    private int publicationYear;

    public Book(final String name,final Author author,final int publicationYear) {
        this.name=name;
        this.publicationYear=publicationYear;
        this.author=author;
    }
    public String getName() {
        return this.name;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
    public void setPublicationYear(final int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public String toString() {
        return this.getName() + " " + this.getAuthor() + ' ' + this.getPublicationYear();
    }
}
