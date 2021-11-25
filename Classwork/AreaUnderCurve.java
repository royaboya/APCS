package Classwork;

// Riemann sum curve for x^2 assignment
public class AreaUnderCurve {
    public static void main(String[] args) {
        System.out.println(xSquareArea(10, 0.000005));
    }

    public static double xSquareArea(double x1, double x2) {
        double horizontal = 0;
        double sum = 0;

        for (double i = 0; i < x1; i += x2) {
            double currentHeight = Math.pow(horizontal, 2);
            sum += currentHeight * x2;
            horizontal += x2;
        }
        return sum;

    }
}
