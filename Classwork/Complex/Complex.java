package Classwork.Complex;

public class Complex {
    private static int numOfComplex = 0;
    private double real;
    private double img;

    public Complex() {
        real = 0;
        img = 0;
        numOfComplex++;
    }

    public Complex(double r, double i) {
        real = r;
        img = i;
        numOfComplex++;
    }

    public static int getNumOfComplex() {
        return numOfComplex;
    }

    public double getReal() {
        return real;
    }

    public double getImg() {
        return img;
    }

    public void setReal(double r) {
        real = r;
    }

    public void setImg(double i) {
        img = i;
    }

    public void add(Complex c) {
        real += c.getReal();
        img += c.getImg();
    }

    public void subtract(Complex c) {
        real -= c.getReal();
        img -= c.getImg();
    }

    public void multiply(Complex c) {
        double temp = getReal();
        real = real * c.getReal() - img * c.getImg();
        img = img * c.getReal() + temp * c.getImg();
    }

    public boolean equals(Complex c) {
        return real == c.getReal() && img == c.getImg();
    }

    // This is really ugly but i'm too lazy to make it better
    public String toString() {
        String sign;
        if (img < 0) {
            sign = " - ";
        } else {
            sign = " + ";
        }

        if (real == 0) {
            if (img == 0) {
                return "0.0";
            }
            if (img == 1) {
                return "i";
            }
            return img + "i";
        }

        else if (img == 0) {
            if (real == 1) {
                return real + "";
            }
            return real + sign + "i";
        }

        if (Math.abs(img) == 1) {
            return real + sign + "i";
        }

        return real + sign + Math.abs(img) + "i";

    }

}
