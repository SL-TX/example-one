package ru.skypro.transport;

public class Bus extends Transport {

    public Bus(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        super.startMoving();
    }

    @Override
    public void stopMoving() {
        super.stopMoving();
    }
}
