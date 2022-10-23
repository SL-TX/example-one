package ru.skypro.transport;

public abstract class Driver{

    private final Transport transport;
    private String fio;
    private Boolean haveRights;
    private Integer stazh;

    public Driver(String fio, Boolean haveRights, Integer stazh, Transport transport) {
        this.fio = fio;
        this.haveRights = haveRights;
        this.stazh = stazh;
        this.transport = transport;
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
}
