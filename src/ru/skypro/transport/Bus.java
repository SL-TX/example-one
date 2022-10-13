package ru.skypro.transport;

public class Bus extends Transport implements Competitive {

    public Bus(String brand, String model, Double engineVolume, BusType type) {
        super(brand, model, engineVolume, type);
    }

    @Override
    public void startMoving() {
        super.startMoving();
    }

    @Override
    public void stopMoving() {
        super.stopMoving();
    }
    @Override
    public void pitStop() {
        System.out.println("false");
    }

    @Override
    public void maxSpeed() {
        System.out.println("200");
    }

    @Override
    public void bestTime() {
        System.out.println("9.00");
    }
}
