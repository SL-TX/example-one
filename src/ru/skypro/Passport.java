package ru.skypro;

import java.util.Objects;

public class Passport {
    private final String НомерПаспорта;
    private final String Фамилия;
    private final String Имя;
    private final String Отчество;
    private final String ДатаРождения;

    public Passport(String номерПаспорта, String фамилия, String имя, String отчество, String датаРождения) {
        НомерПаспорта = номерПаспорта;
        Фамилия = фамилия;
        Имя = имя;
        Отчество = отчество;
        ДатаРождения = датаРождения;
    }

    public String getНомерПаспорта() {
        return НомерПаспорта;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "НомерПаспорта='" + НомерПаспорта + '\'' +
                ", Фамилия='" + Фамилия + '\'' +
                ", Имя='" + Имя + '\'' +
                ", Отчество='" + Отчество + '\'' +
                ", ДатаРождения='" + ДатаРождения + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passport passport)) return false;
        return Objects.equals(НомерПаспорта, passport.НомерПаспорта);
    }

    @Override
    public int hashCode() {
        return Objects.hash(НомерПаспорта);
    }
}
