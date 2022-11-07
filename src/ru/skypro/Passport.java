package ru.skypro;

import java.util.Objects;

public class Passport {
    private final String numPassport;
    private final String lastName;
    private final String firstName;
    private final String secondName;
    private final String birthDate;

    public Passport(String numPassport, String lastName, String firstName, String secondName, String birthDate) {
        this.numPassport = numPassport;
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDate = birthDate;
    }

    public String getNumPassport() {
        return numPassport;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "НомерПаспорта='" + numPassport + '\'' +
                ", Фамилия='" + lastName + '\'' +
                ", Имя='" + firstName + '\'' +
                ", Отчество='" + secondName + '\'' +
                ", ДатаРождения='" + birthDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passport passport)) return false;
        return Objects.equals(numPassport, passport.numPassport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numPassport);
    }
}
