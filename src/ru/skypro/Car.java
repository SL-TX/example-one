package ru.skypro;

import java.util.Objects;

public class Car {
    private String brand;

    public Car(String brand, String model, String engineVolume, String color, Integer productionYear, String productionCountry) {
        this.brand = Objects.requireNonNullElse(brand,"default");
        this.model = Objects.requireNonNullElse(model,"default");
        this.engineVolume = Objects.requireNonNullElse(engineVolume," 1,5 л");
        this.color = Objects.requireNonNullElse(color,"белый");
        this.productionYear = Objects.requireNonNullElse(productionYear,2000);
        this.productionCountry = Objects.requireNonNullElse(productionCountry,"default");
    }

    private String model;
    private String engineVolume;
    private String color;

    public Car() {
        this(null,null,null,null,null,null);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume='" + engineVolume + '\'' +
                ", color='" + color + '\'' +
                ", productionYear='" + productionYear + '\'' +
                ", productionCountry='" + productionCountry + '\'' +
                '}';
    }

    private Integer productionYear;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(String engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    private String productionCountry;
}
