package Classwork.Quadrilateral;

public class Quadrilateral {
    private static int numOfQuads;

    private double s1;
    private double s2;
    private double s3;
    private double s4;

    public Quadrilateral() {
        s1 = 1;
        s2 = 1;
        s3 = 1;
        s4 = 1;
        numOfQuads++;
    }

    public Quadrilateral(double s1, double s2, double s3, double s4) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        numOfQuads++;
    }

    public static int getNumOfQuads() {
        return numOfQuads;
    }

    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }

    public double getS3() {
        return s3;
    }

    public double getS4() {
        return s4;
    }

    public void setS1(double s) {
        s1 = s;
    }

    public void setS2(double s) {
        s2 = s;
    }

    public void setS3(double s) {
        s3 = s;
    }

    public void setS4(double s) {
        s4 = s;
    }

    public double getPerimeter() {
        return s1 + s2 + s3 + s4;
    }

    public String toString() {
        return String.format("Quadrilateral Sides %1$s,%2$s,%3$s,%4$s; Perimeter = %5$s", s1, s2, s3, s4,
                getPerimeter());
    }

}
