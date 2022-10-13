package ru.skypro.animals.hierarchy;

import ru.skypro.animals.Main;

abstract class Mlekopitaushie extends Animal{
    private String area;
    private Integer speed;
    protected void walk(){

    };

    public Mlekopitaushie(String klichka, Integer numYears, String area, Integer speed) {
        super(klichka, numYears);
        this.area = Main.CheckUtil.checkString(area,"area");
        this.speed = Main.CheckUtil.checkInteger(speed,10);
    }

    @Override
    public String toString() {
        return "Mlekopitaushie{" + super.toString() +
                "area='" + area + '\'' +
                ", speed=" + speed +
                '}';
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = Main.CheckUtil.checkString(area,"area");
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = Main.CheckUtil.checkInteger(speed,10);
    }
    @Override
    protected void eat() {

    }

    @Override
    protected void sleep() {

    }

    @Override
    protected void go() {

    }
}
