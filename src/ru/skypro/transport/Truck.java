package ru.skypro.transport;

import ru.skypro.exceptions.DiagnosticFailException;

public class Truck extends Transport implements Competitive{

    public Truck(String brand, String model, Double engineVolume, TruckBody type) {
        super(brand, model, engineVolume, type);
    }

    @Override
    public void startMoving() {
        System.out.println(super.getBrand() +" "+ super.getModel() + " Начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println(super.getBrand() +" "+ super.getModel() + " Закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("true");
    }

    @Override
    public void maxSpeed() {
        System.out.println("330");
    }

    @Override
    public void bestTime() {
        System.out.println("6.00");
    }

    @Override
    public Boolean diagnostic() {
        return this.getEngineVolume() >= 2;
    }
}
