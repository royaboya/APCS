package Classwork;

/** Brute force for Riemann sum assignment, area of f(x) = x^2 */
public class AreaUnderCurve {
    public static void main(String[] args) {
        // test values
        System.out.println(xSquareArea(10, 0.0005));
        System.out.println(xSquareArea(50, 0.0005));
        System.out.println(xSquareArea(100, 0.0005));
    }

    public static double xSquareArea(double x1, double x2) {
        double horizontal = 0;
        double areaSum = 0;

        for (double i = 0; i < x1; i += x2) {
            double currentHeight = Math.pow(horizontal, 2);
            areaSum += currentHeight * x2;
            horizontal += x2;
        }
        return areaSum;

    }
}
