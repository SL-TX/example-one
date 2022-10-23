package ru.skypro;

public class Sponsor {
    private final String name;
    private final Integer sumSupport;

    public Sponsor(String name, Integer sumSupport) {
        this.name = name;
        this.sumSupport = sumSupport;
    }

    public String getName() {
        return name;
    }

    private void sponsirovatZaezd(){}

    @Override
    public String toString() {
        return "Sponsor{" +
                "name='" + name + '\'' +
                ", sumSupport=" + sumSupport +
                '}';
    }
}
