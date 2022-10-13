package ru.skypro.transport;

public class Driver<T extends Transport > {
    private String fio;
    private Boolean haveRights;
    private Integer stazh;

    public Driver(String fio, Boolean haveRights, Integer stazh) {
        this.fio = fio;
        this.haveRights = haveRights;
        this.stazh = stazh;
    }

    public void startMoving(T transport){
        transport.startMoving();
    }
    public void stopMoving(T transport){
        transport.stopMoving();

    }
    public void refill(T transport){
        System.out.println("водитель "+fio+" управляет автомобилем "+transport.getBrand()+" "+transport.getModel()+" и будет участвовать в заезде");
    }
}
