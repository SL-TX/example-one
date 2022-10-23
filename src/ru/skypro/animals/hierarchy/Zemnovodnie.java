package ru.skypro.animals.hierarchy;

import ru.skypro.animals.Main;

import java.util.Objects;

public class Zemnovodnie extends Animal{
    private String area;
    protected void hunt(){};

    public Zemnovodnie(String klichka, Integer numYears, String area) {
        super(klichka,numYears);
        this.area = Main.CheckUtil.checkString(area,"area");
    }

    @Override
    public String toString() {
        return "Zemnovodnie{" + super.toString() +
                "area='" + area + '\'' +
                '}';
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = Main.CheckUtil.checkString(area,"area");
    }
    @Override
    protected void eat() {

    }

    @Override
    protected void go() {

    }

    @Override
    protected void sleep() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Zemnovodnie that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getArea(), that.getArea());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getArea());
    }
}
