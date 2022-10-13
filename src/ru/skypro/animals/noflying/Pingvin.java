package ru.skypro.animals.noflying;

import ru.skypro.animals.hierarchy.NoFlying;

public final class Pingvin extends NoFlying {
    public Pingvin(String klichka, Integer numYears, String area, String moveType) {
        super(klichka, numYears, area, moveType);
    }

    @Override
    protected void hunt() {

    }

    @Override
    protected void walk() {

    }
}
