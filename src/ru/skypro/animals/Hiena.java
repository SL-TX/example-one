package ru.skypro.animals;

import ru.skypro.animals.hierarchy.Hischniki;

public class Hiena extends Hischniki {
    public Hiena(String klichka, String area, Integer speed, String typeOfPisha) {
        super(klichka, area, speed, typeOfPisha);
    }

    @Override
    protected void hunt() {

    }
}
