package ru.skypro.animals.hierarchy;

abstract class Birds extends Animal{

    private String area;
    protected abstract void hunt();

    public Birds(String klichka, String area) {
        super(klichka);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    @Override
    protected void eat() {

    }

    @Override
    protected void sleep() {

    }
}
