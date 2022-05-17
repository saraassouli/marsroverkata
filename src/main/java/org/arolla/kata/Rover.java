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
        switch (cmd) {
            case 'R':
                rightRotation();
                break;
            case 'L':
                leftRotation();
                break;
            case 'M':
                move();
                break;
        }
    }

    private void move() {
        switch (this.orientation) {
            case 'N':
                if (y < 5) this.y++;
                break;
            case 'E':
                if (x < 5) this.x++;
                break;
            case 'S':
                if (y > 0) this.y--;
                break;
            case 'W':
                if (x > 0) this.x--;
                break;

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

    private void leftRotation() {
        switch (this.orientation) {
            case 'N':
                this.orientation = 'W';
                break;
            case 'E':
                this.orientation = 'N';
                break;
            case 'S':
                this.orientation = 'E';
                break;
            case 'W':
                this.orientation = 'S';
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

    public String getPosition() {
        return this.x + " " + this.y + " " + this.orientation;
    }
}
