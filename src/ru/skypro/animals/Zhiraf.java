package ru.skypro.animals;

import ru.skypro.animals.hierarchy.Travoyadnie;

public class Zhiraf extends Travoyadnie {
    public Zhiraf(String klichka, String area, Integer speed, String typeOfPisha) {
        super(klichka, area, speed, typeOfPisha);
    }

    @Override
    protected void pastis() {

    }
}
