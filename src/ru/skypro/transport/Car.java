package ru.skypro.transport;

public class Car extends Transport{
    public Car(String brand, String model, Double engineVolume) {
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
