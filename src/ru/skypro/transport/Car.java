package ru.skypro.transport;

import java.time.Year;
import java.util.Objects;
import java.util.regex.Pattern;

public class Car extends Transport {
    private String engineVolume;
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
        super(brand, model, productionYear, productionCountry, color, 160);
        this.engineVolume = engineVolume == null || engineVolume.equals("") ? " 1,5 л" : engineVolume;
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
    String refill() {
        return  "Объекты класса car можно заправлять бензином, дизелем на заправке или заряжать на специальных электроду-парковках, если это электрокар.";
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", engineVolume='" + engineVolume + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", productionYear=" + super.getProductionYear() +
                ", productionCountry='" + super.getProductionCountry() + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", isSummerTiers=" + isSummerTiers +
                '}'+refill();
    }


    public String getEngineVolume() {
        return engineVolume;
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
