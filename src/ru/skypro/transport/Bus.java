package ru.skypro.transport;

public class Bus extends Transport {
    private Integer var1;
    private Integer var2;
    private Integer var3;

    public Bus(String brand, String model, Integer productionYear, String productionCountry, String color, Integer maxSpeed, Integer var1, Integer var2, Integer var3) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    @Override
    String refill() {
        return "Объекты класса bus можно заправлять бензином или дизелем на заправк";
    }

    @Override
    public String toString() {
        return "Bus{" +
                super.toString() +
                "var1=" + var1 +
                ", var2=" + var2 +
                ", var3=" + var3 +
                '}'+
                refill();
    }

    public Integer getVar1() {
        return var1;
    }

    public void setVar1(Integer var1) {
        this.var1 = var1;
    }

    public Integer getVar2() {
        return var2;
    }

    public void setVar2(Integer var2) {
        this.var2 = var2;
    }

    public Integer getVar3() {
        return var3;
    }

    public void setVar3(Integer var3) {
        this.var3 = var3;
    }
}
