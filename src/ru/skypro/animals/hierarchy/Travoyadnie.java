package ru.skypro.animals.hierarchy;

public abstract class Travoyadnie extends Mlekopitaushie {
    private String typeOfPisha;
    protected abstract void pastis();

    public Travoyadnie(String klichka, String area, Integer speed, String typeOfPisha) {
        super(klichka, area, speed);
        this.typeOfPisha = typeOfPisha;
    }

    public String getTypeOfPisha() {
        return typeOfPisha;
    }

    public void setTypeOfPisha(String typeOfPisha) {
        this.typeOfPisha = typeOfPisha;
    }
}
