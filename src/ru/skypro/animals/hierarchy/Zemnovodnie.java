package ru.skypro.animals.hierarchy;

import ru.skypro.animals.Main;

public abstract class Zemnovodnie extends Animal{
    private String area;
    protected abstract void hunt();

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
}
