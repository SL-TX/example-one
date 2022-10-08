package ru.skypro.animals;

import ru.skypro.animals.hierarchy.NoFlying;

public class Pingvin extends NoFlying {
    public Pingvin(String klichka, String area, String moveType) {
        super(klichka, area, moveType);
    }

    @Override
    protected void hunt() {

    }

    @Override
    protected void walk() {

    }
}
