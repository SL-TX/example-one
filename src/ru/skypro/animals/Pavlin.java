package ru.skypro.animals;

import ru.skypro.animals.hierarchy.NoFlying;

public class Pavlin extends NoFlying {
    public Pavlin(String klichka, String area, String moveType) {
        super(klichka, area, moveType);
    }

    @Override
    protected void walk() {

    }

    @Override
    protected void hunt() {

    }
}
