package ru.skypro.animals;

import ru.skypro.animals.hierarchy.Hischniki;

public class Medved extends Hischniki {
    public Medved(String klichka, String area, Integer speed, String typeOfPisha) {
        super(klichka, area, speed, typeOfPisha);
    }

    @Override
    protected void hunt() {

    }
}
