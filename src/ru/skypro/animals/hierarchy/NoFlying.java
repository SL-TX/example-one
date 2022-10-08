package ru.skypro.animals.hierarchy;

public abstract class NoFlying extends Birds {
    private String moveType;
    protected abstract void walk();

    public NoFlying(String klichka, String area, String moveType) {
        super(klichka, area);
        this.moveType = moveType;
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        this.moveType = moveType;
    }
}
