package ru.skypro;
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
}
