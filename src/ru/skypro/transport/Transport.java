package ru.skypro.transport;

public abstract class Transport {
    private String brand;
    private String model;
    private Double engineVolume;

    public Transport(String brand, String model, Double engineVolume) {
        this.brand = brand == null || brand.equals("") ? "default" : brand;
        this.model = model == null || model.equals("") ? "default" : model;
        this.engineVolume = (engineVolume == null || engineVolume<0) ? 1.6 : engineVolume;
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
}
