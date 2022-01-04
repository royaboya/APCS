package Classwork.Quadrilateral;

public class Square extends Rectangle {
    private static int numOfSquares;

    public Square() {
        super();
        numOfSquares++;
    }

    public Square(double side) {
        super(side, side);
        numOfSquares++;
    }

    public static int getNumOfSquares() {
        return numOfSquares;
    }

    public double getSide() {
        return getS1();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public String toString() {
        return String.format("Square with side length %1$s; Perimeter = %2$s; Area = %3$s", getS1(), getPerimeter(),
                getArea());
    }

    public boolean equals(Square other) {
        return getS1() == other.getS1();
    }

}
