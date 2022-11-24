package ru.skypro.transport;

import ru.skypro.exceptions.WrongRightsException;

public class DriverC extends Driver<Truck>{
    public DriverC(String fio, Boolean haveRights, Integer experience, Truck transport) throws WrongRightsException {
        super(fio, haveRights, experience, transport);
    }
}
