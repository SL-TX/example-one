package ru.skypro.transport;

import ru.skypro.exceptions.WrongRightsException;

public class DriverD extends Driver<Bus>{
    public DriverD(String fio, Boolean haveRights, Integer stazh, Bus transport) throws WrongRightsException {
        super(fio, haveRights, stazh, transport);
    }
}
