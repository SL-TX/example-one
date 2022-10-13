package ru.skypro.animals.hischniki;

import ru.skypro.animals.hierarchy.Hischniki;

public final class Medved extends Hischniki {
    public Medved(String klichka, Integer numYears, String area, Integer speed, String typeOfPisha) {
        super(klichka, numYears, area, speed, typeOfPisha);
    }

    @Override
    protected void hunt() {

    }
}
