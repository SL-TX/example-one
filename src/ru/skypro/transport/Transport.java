package ru.skypro.transport;

import ru.skypro.Mechanic;
import ru.skypro.Sponsor;
import ru.skypro.exceptions.DiagnosticFailException;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    private String brand;
    private String model;
    private Double engineVolume;

    private final Enum<?> type;

    private List<Mechanic> mechanicList = new ArrayList<>();

    private Driver driver;

    private List<Sponsor> sponsorsList = new ArrayList<>();

    public Transport(String brand, String model, Double engineVolume, Enum<?> type) {
        this.brand = brand == null || brand.equals("") ? "default" : brand;
        this.model = model == null || model.equals("") ? "default" : model;
        this.engineVolume = (engineVolume == null || engineVolume<0) ? 1.6 : engineVolume;
        this.type = type;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public List<Sponsor> getSponsorsList() {
        return sponsorsList;
    }

    public void addMechanic(Mechanic mechanic) {
        if (mechanic.getListCarTypes().contains(this.getClass().getSimpleName())) {
            this.mechanicList.add(mechanic);
        } else System.out.println("Механик "+mechanic.getFirstName()+" "+mechanic.getLastName()+" не имеет нужной категории, для автомобиля "+this.brand+" "+this.model);
    }

    public void addSponsor(Sponsor sponsors) {
        this.sponsorsList.add(sponsors);
    }

    public void startMoving(){
        System.out.println(this.getClass() +" "+ this.brand +" "+ this.model + "Начал движение");
    }
    public void stopMoving(){
        System.out.println(this.getClass() +" "+ this.brand +" "+ this.model + "Закончил движение");
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public Boolean diagnostic() {
        System.out.println("Автобус … … … в диагностике не требуется");
        return true;
    }

    public String getType() {
        return type == null ? "Данных недостаточно": type.name();
    }
}
