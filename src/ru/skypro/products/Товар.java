package ru.skypro.products;

import java.util.Objects;

public class Товар {

    private final String Название;
    private final Integer Цена;
    private final Integer ВесВКг;

    public Товар(String название, Integer цена, Integer весВКг) {
        if (название == null||цена == null || весВКг == null){
            throw new RuntimeException("Заполните карточку товара полностью");
        }
        Название = название;
        Цена = цена;
        ВесВКг = весВКг;
    }

    @Override
    public String toString() {
        return "Товар{" +
                "Название='" + Название + '\'' +
                ", Цена=" + Цена +
                ", ВесВКг=" + ВесВКг +
                '}';
    }

    public String getНазвание() {
        return Название;
    }

    public Integer getЦена() {
        return Цена;
    }

    public Integer getВесВКг() {
        return ВесВКг;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Товар товар)) return false;
        return Objects.equals(Цена, товар.Цена) && Objects.equals(ВесВКг, товар.ВесВКг);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Цена, ВесВКг);
    }
}
