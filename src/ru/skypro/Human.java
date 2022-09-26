package ru.skypro;

import java.util.Objects;

public class Human {
    @Override
    public String toString() {
        return "Привет! Меня зовут "+name+". Я из города "+town+". Я родился в "+yearOfBirth+" году. Будем знакомы! Я работаю на должности "+position+" . Будем знакомы!";
    }

    private Integer yearOfBirth;
    private String name;
    private String position;
    private String town;

    public Human(Integer yearOfBirth, String name, String town, String position) {
        this.yearOfBirth = Objects.requireNonNullElse(yearOfBirth, 0);
        this.name = Objects.requireNonNullElse(name,"Информация не указана");
        this.town = Objects.requireNonNullElse(town,"Информация не указана");
        this.position = Objects.requireNonNullElse(position,"Информация не указана");
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
