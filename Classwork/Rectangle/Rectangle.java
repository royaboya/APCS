package Classwork.Rectangle;

public class Rectangle {
    private int width;
    private int height;
    private static int numOfRects;

    public Rectangle() {
        width = (int) (Math.random() * 9) + 1;
        height = (int) (Math.random() * 9) + 1;
        numOfRects++;
    }

    public Rectangle(int i) {
        width = i;
        height = i;
        numOfRects++;
    }

    public Rectangle(int w, int h) {
        width = w;
        height = h;
        numOfRects++;
    }

    public static int getNumOfRects() {
        return numOfRects;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getArea() {
        return getWidth() * getHeight();
    }

    public int getAreaDiff(Rectangle other) {
        return other.getArea() - getArea();
    }

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }

    public String toString() {
        return String.format("This is a %1$s by %2$s rectangle.", width, height);
    }

}