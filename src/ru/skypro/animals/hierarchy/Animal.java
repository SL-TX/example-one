package ru.skypro.animals.hierarchy;

abstract class Animal {
    private String klichka;
    private Integer numYears;
    protected abstract void eat();
    protected abstract void sleep();
    public void move(){

    };

    public Animal(String klichka) {
        this.klichka = klichka;
    }

    public String getKlichka() {
        return klichka;
    }

    public void setKlichka(String klichka) {
        this.klichka = klichka;
    }

    public Integer getNumYears() {
        return numYears;
    }

    public void setNumYears(Integer numYears) {
        this.numYears = numYears;
    }
}
