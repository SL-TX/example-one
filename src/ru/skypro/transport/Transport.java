package ru.skypro.transport;

public abstract class Transport {
    private String brand;
    private String model;
    private final Integer productionYear;
    private final String productionCountry;
    private String color;
    private Integer maxSpeed;

    abstract String refill();

    public Transport(String brand, String model, Integer productionYear, String productionCountry, String color, Integer maxSpeed) {
        this.brand = brand == null || brand.equals("") ? "default" : brand;
        this.model = model == null || model.equals("") ? "default" : model;
        this.color = color == null || color.equals("") ? "белый" : color;
        this.productionYear = productionYear == null || productionYear <= 0 ? 2000 : productionYear;
        this.productionCountry = productionCountry == null || productionCountry.equals("") ? "default" : productionCountry;
        this.maxSpeed = maxSpeed == null || maxSpeed < 0 ? 0 : maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setBrand(String brand) {
        this.brand = brand == null || brand.equals("") ? "default" : brand;
    }

    public void setModel(String model) {
        this.model = model == null || model.equals("") ? "default" : model;
    }

    public void setColor(String color) {
        this.color = color == null || color.equals("") ? "белый" : color;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed == null || maxSpeed < 0 ? 0 : maxSpeed;
    }
}
