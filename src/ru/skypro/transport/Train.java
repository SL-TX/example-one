package ru.skypro.transport;

public class Train extends Transport {

    private Double cost;
    private Integer timeInMinutes;
    private String startStantion;
    private String endStantion;
    private Integer numVagons;


    public Train(String brand, String model, Integer productionYear, String productionCountry, String color, Integer maxSpeed,
                 Double cost,
                 Integer timeInMinutes,
                 String startStantion,
                 String endStantion,
                 Integer numVagons
    ) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.cost = cost == null ? 120.0 : cost;
        this.timeInMinutes = timeInMinutes == null ? 60 : timeInMinutes;
        this.startStantion = startStantion == null ? "start" : startStantion;
        this.endStantion = endStantion == null ? "end" : endStantion;
        this.numVagons = numVagons == null ? 6 : numVagons;

    }

    @Override
    String refill() {
        return "Объекты класса train нужно заправлять дизелем.";
    }

    @Override
    public String toString() {
        return "Train{" +
                super.toString() +
                "cost=" + cost +
                ", timeInMinutes=" + timeInMinutes +
                ", startStantion='" + startStantion + '\'' +
                ", endStantion='" + endStantion + '\'' +
                ", numVagons=" + numVagons +
                '}'+refill();
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getTimeInMinutes() {
        return timeInMinutes;
    }

    public void setTimeInMinutes(Integer timeInMinutes) {
        this.timeInMinutes = timeInMinutes;
    }

    public String getStartStantion() {
        return startStantion;
    }

    public void setStartStantion(String startStantion) {
        this.startStantion = startStantion;
    }

    public String getEndStantion() {
        return endStantion;
    }

    public void setEndStantion(String endStantion) {
        this.endStantion = endStantion;
    }

    public Integer getNumVagons() {
        return numVagons;
    }

    public void setNumVagons(Integer numVagons) {
        this.numVagons = numVagons;
    }
}
