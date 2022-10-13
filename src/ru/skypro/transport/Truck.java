package ru.skypro.transport;

public class Truck extends Transport{

    public Truck(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println(super.getBrand() +" "+ super.getModel() + " Начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println(super.getBrand() +" "+ super.getModel() + " Закончил движение");
    }
}
