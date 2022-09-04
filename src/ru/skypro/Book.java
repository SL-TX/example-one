package ru.skypro;

import java.util.Objects;

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
    @Override
    public String toString() {
        return this.getName() + " " + this.getAuthor() + ' ' + this.getPublicationYear();
    }
    // Alt+Insert generated
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getPublicationYear() == book.getPublicationYear() && getName().equals(book.getName()) && getAuthor().equals(book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAuthor(), getPublicationYear());
    }

}
