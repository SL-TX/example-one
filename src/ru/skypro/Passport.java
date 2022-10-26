package ru.skypro;

import java.util.Objects;

public class Passport {
    private final String numPassport;
    private final String fam;
    private final String im;
    private final String otch;
    private final String dataRozhdeniya;

    public Passport(String numPassport, String fam, String im, String otch, String dataRozhdeniya) {
        this.numPassport = numPassport;
        this.fam = fam;
        this.im = im;
        this.otch = otch;
        this.dataRozhdeniya = dataRozhdeniya;
    }

    public String getNumPassport() {
        return numPassport;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "НомерПаспорта='" + numPassport + '\'' +
                ", Фамилия='" + fam + '\'' +
                ", Имя='" + im + '\'' +
                ", Отчество='" + otch + '\'' +
                ", ДатаРождения='" + dataRozhdeniya + '\'' +
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
