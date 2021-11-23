package Homework.PointHW;

public class Point {
    private int xCoor;
    private int yCoor;
    private static int numOfPoints;

    public Point() {
        xCoor = 0;
        yCoor = 0;
        numOfPoints++;
    }

    public Point(int x, int y) {
        xCoor = x;
        yCoor = y;
        numOfPoints++;
    }

    public static void main(String[] args) {

    }

    public static int getNumOfPoints() {
        return numOfPoints;
    }

    public int getxCoor() {
        return xCoor;
    }

    public int getyCoor() {
        return yCoor;
    }

    public void setxCoor(int x) {
        xCoor = x;
    }

    public void setyCoor(int y) {
        yCoor = y;
    }

    public void setCoor(int x, int y) {
        xCoor = x;
        yCoor = y;
    }

    public void goHome() {
        xCoor = 0;
        yCoor = 0;
    }

    public void move(int deltaX, int deltaY) {
        xCoor += deltaX;
        yCoor += deltaY;
    }

    public double distance(Point other) {
        double changeX = xCoor - other.xCoor;
        double changeY = yCoor - other.yCoor;
        return Math.sqrt(Math.pow(changeX, 2) + Math.pow(changeY, 2));
    }

    public String toString() {
        return String.format("(%1$s,%2$s)", xCoor, yCoor);
    }

    public boolean equals(Point other) {
        return xCoor == other.xCoor && yCoor == other.yCoor;
    }
}