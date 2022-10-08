package ru.skypro.animals;

import ru.skypro.animals.hierarchy.Flying;

public class Albotros extends Flying {
    public Albotros(String klichka, String area, String moveType) {
        super(klichka, area, moveType);
    }

    @Override
    protected void hunt() {

    }

    @Override
    protected void fly() {

    }
}
