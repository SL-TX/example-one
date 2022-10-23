package ru.skypro.animals.hierarchy;

import ru.skypro.animals.Main;

import java.util.Objects;

abstract class Birds extends Animal{

    private String area;
    protected void hunt() {};

    public Birds(String klichka, Integer numYears, String area) {
        super(klichka,numYears);
        this.area = Main.CheckUtil.checkString(area,"area");
    }

    @Override
    public String toString() {
        return "Birds{" + super.toString() +
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
        if (!(o instanceof Birds birds)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getArea(), birds.getArea());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getArea());
    }
}
