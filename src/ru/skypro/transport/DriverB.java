package ru.skypro.transport;

import ru.skypro.exceptions.WrongRightsException;

public class DriverB extends Driver<Car>{
    public DriverB(String fio, Boolean haveRights, Integer stazh, Car transport) throws WrongRightsException {
        super(fio, haveRights, stazh, transport);
    }
}
