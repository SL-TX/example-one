package ru.skypro;

import java.util.Objects;

//@AllArgsConstructor
//@Getter
public class Author {
    private String firstName;
    private String lastName;

    public Author(final String firstName,final String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    @Override
    public String toString() {
        return this.getFirstName() + ' ' + this.getLastName();
    }
// Alt+Insert generated
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return getFirstName().equals(author.getFirstName()) && getLastName().equals(author.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }
}
