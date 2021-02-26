package models;

import java.util.HashMap;

public class Board {
    private final HashMap<Integer, Integer> ladders;
    private final HashMap<Integer, Integer> chutes;
    private final int startingSquareNum;
    private final int winningSquareNum;

    public Board() {
        this.ladders = initializeLadders();
        this.chutes = initializeChutes();
        this.startingSquareNum = 1;
        this.winningSquareNum = 100;
    }

    public HashMap<Integer, Integer> getLadders() {
        return this.ladders;
    }

    public HashMap<Integer, Integer> getChutes() {
        return this.chutes;
    }

    public int getStartingSquareNum() {
        return startingSquareNum;
    }

    public int getWinningSquareNum() {
        return winningSquareNum;
    }

    private HashMap<Integer, Integer> initializeLadders() {
        HashMap<Integer, Integer> ladders = new HashMap<>();
        ladders.put(1, 38);
        ladders.put(4, 14);
        ladders.put(9, 31);
        ladders.put(21, 42);
        ladders.put(28, 84);
        ladders.put(36, 44);
        ladders.put(51, 67);
        ladders.put(71, 91);
        ladders.put(80, 100);
        return ladders;
    }

    private HashMap<Integer, Integer> initializeChutes() {
        HashMap<Integer, Integer> chutes = new HashMap<>();
        chutes.put(16, 6);
        chutes.put(47, 26);
        chutes.put(49, 11);
        chutes.put(56, 53);
        chutes.put(62, 19);
        chutes.put(64, 60);
        chutes.put(87, 24);
        chutes.put(93, 73);
        chutes.put(95, 75);
        chutes.put(98, 78);
        return chutes;
    }

}
