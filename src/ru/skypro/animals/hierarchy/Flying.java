package ru.skypro.animals.hierarchy;

import ru.skypro.animals.Main;

public abstract class Flying extends Birds{
    private String moveType;
    protected abstract void fly();

    public Flying(String klichka, Integer numYears, String area, String moveType) {
        super(klichka, numYears, area);
        this.moveType = Main.CheckUtil.checkString(moveType,"moveType");
    }

    @Override
    public String toString() {
        return "Flying{" + super.toString() +
                "moveType='" + moveType + '\'' +
                '}';
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        this.moveType = Main.CheckUtil.checkString(moveType,"moveType");
    }

    @Override
    protected void go() {
        super.go();
    }

    @Override
    protected void eat() {
        super.eat();
    }
}
