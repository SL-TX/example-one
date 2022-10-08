package ru.skypro.animals.hierarchy;

abstract class Mlekopitaushie extends Animal{
    private String area;
    private Integer speed;
    protected void walk(){

    };

    public Mlekopitaushie(String klichka, String area, Integer speed) {
        super(klichka);
        this.area = area;
        this.speed = speed;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
    @Override
    protected void eat() {

    }

    @Override
    protected void sleep() {

    }
}
