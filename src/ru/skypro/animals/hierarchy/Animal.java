package ru.skypro.animals.hierarchy;

import ru.skypro.animals.Main;

import java.util.Objects;

abstract class Animal {
    private String klichka;
    private Integer numYears;
    protected abstract void eat();
    protected abstract void sleep();
    protected abstract void go();

    public Animal(String klichka, Integer numYears) {
        this.klichka = Main.CheckUtil.checkString(klichka,"klichka");
        this.numYears = Main.CheckUtil.checkInteger(numYears,5);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "klichka='" + klichka + '\'' +
                ", numYears=" + numYears +
                '}';
    }

    public String getKlichka() {
        return klichka;
    }

    public void setKlichka(String klichka) {
        this.klichka = Main.CheckUtil.checkString(klichka,"klichka");
    }

    public Integer getNumYears() {
        return numYears;
    }

    public void setNumYears(Integer numYears) {
        this.numYears = numYears;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return getKlichka().equals(animal.getKlichka()) && getNumYears().equals(animal.getNumYears());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKlichka(), getNumYears());
    }
}
