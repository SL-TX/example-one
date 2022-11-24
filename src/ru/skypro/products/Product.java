package ru.skypro.products;

import java.util.Objects;

public class Product {

    private final String name;
    private final Integer cost;
    private final Integer weight;

    public Product(String name, Integer cost, Integer weight) {
        if (name == null|| cost == null || weight == null){
            throw new RuntimeException("Заполните карточку товара полностью");
        }
        this.name = name;
        this.cost = cost;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Товар{" +
                "Название='" + name + '\'' +
                ", Цена=" + cost +
                ", ВесВКг=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }

    public Integer getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
