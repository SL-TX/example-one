package ru.skypro.animals.noflying;

import ru.skypro.animals.hierarchy.NoFlying;

public final class Pavlin extends NoFlying {
    public Pavlin(String klichka, Integer numYears, String area, String moveType) {
        super(klichka, numYears, area, moveType);
    }

    @Override
    protected void walk() {

    }

    @Override
    protected void hunt() {

    }
}
