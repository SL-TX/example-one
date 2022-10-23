package ru.skypro.animals.hierarchy;

import ru.skypro.animals.Main;

import java.util.Objects;

public class NoFlying extends Birds {
    private String moveType;
    protected void walk(){};

    public NoFlying(String klichka, Integer numYears, String area, String moveType) {
        super(klichka,numYears, area);
        this.moveType = Main.CheckUtil.checkString(moveType,"moveType");
    }

    @Override
    public String toString() {
        return "NoFlying{" + super.toString() +
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NoFlying noFlying)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getMoveType(), noFlying.getMoveType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMoveType());
    }
}
