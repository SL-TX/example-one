package ru.skypro.animals.travoyadnie;

import ru.skypro.animals.hierarchy.Travoyadnie;

public final class Gazel extends Travoyadnie {

    public Gazel(String klichka, Integer numYears, String area, Integer speed, String typeOfPisha) {
        super(klichka, numYears, area, speed, typeOfPisha);
    }

    @Override
    protected void pastis() {

    }
}
