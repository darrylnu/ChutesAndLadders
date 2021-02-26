package models;

public class Player {
    private String name;
    private int squareNum;
    private int firstSpin;

    public Player(String name) {
        this.name = name;
        this.squareNum = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSquareNum(int squareNum) {
        this.squareNum = squareNum;
    }

    public int getSquareNum() {
        return squareNum;
    }

    public void setFirstSpin(int firstSpin) {
        this.firstSpin = firstSpin;
    }

    public int getFirstSpin() {
        return this.firstSpin;
    }
}
