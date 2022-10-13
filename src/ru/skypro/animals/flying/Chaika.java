package ru.skypro.animals.flying;

import ru.skypro.animals.hierarchy.Flying;

public final class Chaika extends Flying {
    public Chaika(String klichka, Integer numYears, String area, String moveType) {
        super(klichka, numYears, area, moveType);
    }

    @Override
    protected void hunt() {

    }

    @Override
    protected void fly() {

    }
}
