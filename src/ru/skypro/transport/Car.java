package ru.skypro.transport;

public class Car extends Transport implements Competitive{
    public Car(String brand, String model, Double engineVolume, CarBody type) {
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
        System.out.println("160");
    }

    @Override
    public void bestTime() {
        System.out.println("10.00");
    }
}
