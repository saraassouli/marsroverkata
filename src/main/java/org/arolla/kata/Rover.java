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

    public void runCommand(char cmd) {
        if(cmd=='R') {
            rightRotation();
        }
    }

    private void rightRotation() {
        switch (this.orientation) {
            case 'N':
                this.orientation = 'E';
                break;
            case 'E':
                this.orientation = 'S';
                break;
            case 'S':
                this.orientation = 'W';
                break;
            case 'W':
                this.orientation = 'N';
                break;

        }
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
