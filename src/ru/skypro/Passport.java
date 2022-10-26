package ru.skypro;

import java.util.Objects;

public class Passport {
    private final String NomerPasporta;
    private final String Familia;
    private final String Imya;
    private final String Otchestvo;
    private final String DataRozhdenia;

    public Passport(String nomerPasporta, String familia, String imya, String otchestvo, String dataRozhdenia) {
        NomerPasporta = nomerPasporta;
        Familia = familia;
        Imya = imya;
        Otchestvo = otchestvo;
        DataRozhdenia = dataRozhdenia;
    }

    public String getNomerPasporta() {
        return NomerPasporta;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "НомерПаспорта='" + NomerPasporta + '\'' +
                ", Фамилия='" + Familia + '\'' +
                ", Имя='" + Imya + '\'' +
                ", Отчество='" + Otchestvo + '\'' +
                ", ДатаРождения='" + DataRozhdenia + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passport passport)) return false;
        return Objects.equals(NomerPasporta, passport.NomerPasporta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NomerPasporta);
    }
}
