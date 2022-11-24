package ru.skypro.transport;

import ru.skypro.exceptions.WrongRightsException;

public class DriverB extends Driver<Car>{
    public DriverB(String fio, Boolean haveRights, Integer experience, Car transport) throws WrongRightsException {
        super(fio, haveRights, experience, transport);
    }
}
