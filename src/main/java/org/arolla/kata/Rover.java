package org.arolla.kata;

public class Rover {
    private int x;
    private int y;
    private char orientation;

    public Rover(int x, int y, char orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public void runCommand(String cmd) {

    }

    public int getXCoordinate() {
        return x;
    }

    public int getYCoordinate() {
        return y;
    }

    public char getOrientation() {
        return orientation;
    }
}
