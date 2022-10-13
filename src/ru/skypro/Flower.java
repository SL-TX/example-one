package ru.skypro;

import java.util.Objects;

public class Flower {

    private String name;
    private String flowerColor;
    private String country;
    private Double cost;
    private Integer lifeSpan;

    public Flower(String name, String flowerColor, String country, Double cost, Integer lifeSpan) {
        this.name = name;
        this.flowerColor = flowerColor == null || flowerColor.equals("") ? "Белый" : flowerColor;
        this.country = country == null || country.equals("") ? "Россия" : country;
        this.cost = cost == null || cost < 0 ? 1 : Math.round(cost * 100) / 100d;
        this.lifeSpan = lifeSpan == null || lifeSpan <= 0 ? 3 : lifeSpan;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", flowerColor='" + flowerColor + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", lifeSpan=" + lifeSpan +
                '}';
    }

    public void setLifeSpan(Integer lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public Double getCost() {
        return cost;
    }

    public Integer getLifeSpan() {
        return lifeSpan;
    }

    public String getName() {
        return name;
    }
}
