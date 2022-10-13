package ru.skypro.animals.hierarchy;

import ru.skypro.animals.Main;

public abstract class Travoyadnie extends Mlekopitaushie {
    private String typeOfPisha;
    protected abstract void pastis();

    public Travoyadnie(String klichka, Integer numYears, String area, Integer speed, String typeOfPisha) {
        super(klichka,numYears, area, speed);
        this.typeOfPisha = Main.CheckUtil.checkString(typeOfPisha,"typeOfPisha");
    }

    @Override
    public String toString() {
        return "Travoyadnie{" + super.toString() +
                "typeOfPisha='" + typeOfPisha + '\'' +
                '}';
    }

    public String getTypeOfPisha() {
        return typeOfPisha;
    }

    public void setTypeOfPisha(String typeOfPisha) {
        this.typeOfPisha = Main.CheckUtil.checkString(typeOfPisha,"typeOfPisha");
    }

    @Override
    protected void go() {
        super.go();
    }

    @Override
    protected void eat() {
        super.eat();
    }
}
