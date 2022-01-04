package Classwork.Quadrilateral;

public class Rectangle extends Quadrilateral {
    private static int numOfRects;

    public Rectangle() {
        super();
        numOfRects++;
    }

    public Rectangle(double width, double length) {
        super(width, length, width, length);
        numOfRects++;
    }

    public static int getNumOfRects() {
        return numOfRects;
    }

    public double getWidth() {
        return getS1();
    }

    public double getLength() {
        return getS2();
    }

    public void setWidth(double w) {
        setS1(w);
        setS3(w);
    }

    public void setLength(double l) {
        setS2(l);
        setS4(l);
    }

    public double getArea() {
        return getS1() * getS2();
    }

    public boolean equals(Rectangle other) {
        return getLength() == other.getLength() && getWidth() == other.getWidth()
                || getWidth() == other.getLength() && getLength() == other.getWidth();
    }

    public String toString() {
        return String.format("%1$sx%2$s Rectangle; Perimeter = %3$s; Area = %4$s", getS1(), getS2(), getPerimeter(),
                getArea());
    }

}
