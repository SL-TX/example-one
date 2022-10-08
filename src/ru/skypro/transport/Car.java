package ru.skypro.transport;

import java.time.Year;
import java.util.Objects;
import java.util.regex.Pattern;

public class Car {
    private String brand;
    private String model;
    private String engineVolume;
    private String color;
    private Integer productionYear;
    private String productionCountry;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private Integer numberOfSeats;
    private Boolean isSummerTiers;

    public static class Key {
        private Boolean remoteStart;
        private Boolean remoteAccess;

        public Key(Boolean remoteStart, Boolean remoteAccess) {
            this.remoteStart = remoteStart != null && remoteStart;
            this.remoteAccess = remoteAccess != null && remoteAccess;
        }
    }

    public static class Insurance {
        private Integer period;
        private Double cost;
        private String number;

        public Boolean isExpired() {
            return this.period < Year.now().getValue();
        }

        private Boolean checkNumber(String number) {
            if (number == null || number.length() == 0) {
                return false;
            }
            return Pattern.matches("^.{9}$", number);
        }

        public Insurance(Integer period, Double cost, String number) {
            this.period = period == null ? 0 : period;
            this.cost = cost == null ? 1.0 : cost;
            this.number = number;
            if (this.isExpired())
                System.out.println("нужно срочно ехать оформлять новую страховку.");
            if (!checkNumber(number))
                System.out.println("Номер страховки некорректный!");
        }

    }

    private Boolean checkRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.length() == 0)
            return false;
        return Pattern.matches("\\D\\d\\d\\d\\D\\D\\d\\d\\d", registrationNumber);
    }


    public Car(String brand, String model, String engineVolume, String color, Integer productionYear, String productionCountry,
               String transmission, String bodyType, String registrationNumber, Integer numberOfSeats, Boolean isSummerTiers) {
        this.brand = brand == null || brand.equals("") ? "default" : brand;
        this.model = model == null || model.equals("") ? "default" : model;
        this.engineVolume = engineVolume == null || engineVolume.equals("") ? " 1,5 л" : engineVolume;
        this.color = color == null || color.equals("") ? "белый" : color;
        this.productionYear = productionYear == null || productionYear <= 0 ? 2000 : productionYear;
        this.productionCountry = productionCountry == null || productionCountry.equals("") ? "default" : productionCountry;
        this.transmission = transmission == null || transmission.equals("") ? "default" : transmission;
        this.bodyType = bodyType == null || bodyType.equals("") ? "default" : bodyType;
        this.registrationNumber = !checkRegistrationNumber(registrationNumber) ? "X000XX000" : registrationNumber;
        this.numberOfSeats = numberOfSeats == null || numberOfSeats <= 0 ? 4 : numberOfSeats;
        this.isSummerTiers = isSummerTiers == null || isSummerTiers;
    }

    public Car(String brand, String model, String engineVolume, String color, Integer productionYear, String productionCountry) {
        this(brand, model, engineVolume, color, productionYear, productionCountry, null, null, null, null, null);
    }

    public Car() {
        this(null, null, null, null, null, null);
    }

    public void swapTiers() {
        this.isSummerTiers = !this.isSummerTiers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume='" + engineVolume + '\'' +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", isSummerTiers=" + isSummerTiers +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public Boolean getSummerTiers() {
        return isSummerTiers;
    }

    public void setEngineVolume(String engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setSummerTiers(Boolean summerTiers) {
        isSummerTiers = summerTiers;
    }
}
