package ru.skypro.transport;

import ru.skypro.exceptions.WrongRightsException;

public abstract class Driver{

    private final Transport transport;
    private String fio;
    private Boolean haveRights;
    private Integer stazh;

    public Driver(String fio, Boolean haveRights, Integer stazh, Transport transport) throws WrongRightsException {
        this.fio = fio;
        this.haveRights = haveRights;
        this.stazh = stazh;
        if (transport == null) {
            throw new WrongRightsException();
        } else {
            this.transport = transport;
        };
    }

    public void startMoving(){
        transport.startMoving();
    }
    public void stopMoving(){
        transport.stopMoving();

    }
    public void refill(){
        System.out.println("водитель "+fio+" управляет автомобилем "+transport.getBrand()+" "+transport.getModel()+" и будет участвовать в заезде");
    }

    @Override
    public String toString() {
        return "Driver{" +
                "transport=" + transport +
                ", fio='" + fio + '\'' +
                ", haveRights=" + haveRights +
                ", stazh=" + stazh +
                '}';
    }
}
