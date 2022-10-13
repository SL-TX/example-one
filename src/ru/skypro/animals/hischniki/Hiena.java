package ru.skypro.animals.hischniki;

import ru.skypro.animals.hierarchy.Hischniki;

public final class Hiena extends Hischniki {
    public Hiena(String klichka, Integer numYears, String area, Integer speed, String typeOfPisha) {
        super(klichka, numYears, area, speed, typeOfPisha);
    }

    @Override
    protected void hunt() {

    }
}
