package ru.skypro.transport;

import ru.skypro.exceptions.WrongRightsException;

public abstract class Driver<T extends Transport & Competitive>{
    private String fullName;
    private Boolean haveRights;
    private Integer experience;

    private final T transport;

    public Driver(String fullName, Boolean haveRights, Integer experience, T transport) throws WrongRightsException {
        this.fullName = fullName;
        this.haveRights = haveRights;
        this.experience = experience;
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
        System.out.println("водитель "+ fullName +" управляет автомобилем "+transport.getBrand()+" "+transport.getModel()+" и будет участвовать в заезде");
    }

    @Override
    public String toString() {
        return "Driver{" +
                "transport=" + transport +
                ", fio='" + fullName + '\'' +
                ", haveRights=" + haveRights +
                ", experience=" + experience +
                '}';
    }
}
