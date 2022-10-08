package ru.skypro.animals.hierarchy;

public abstract class Hischniki extends Mlekopitaushie{
    private String typeOfPisha;
    protected abstract void hunt();

    public Hischniki(String klichka, String area, Integer speed, String typeOfPisha) {
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
