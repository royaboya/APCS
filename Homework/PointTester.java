package Homework;
//testing class built by Huo Chen; Last Update 11/2/2021

public class PointTester {
    public static void main(String[] args) {
        System.out.print("Constructing a Point called p1 using no-arges constructor...");
        Point p1 = new Point();
        System.out.println("PASSED");
        System.out.println();

        System.out.print("Constructing a Point called p2 using parameterized constructor...");
        Point p2 = new Point(-3, -4);
        System.out.println("PASSED");
        System.out.println();

        System.out.print("Checking p1 instant variables...");
        if (p1.getxCoor() == 0 && p1.getyCoor() == 0) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED!");
        }
        System.out.println();

        System.out.print("Checking p2 instant variables...");
        if (p2.getxCoor() == -3 && p2.getyCoor() == -4) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED!");
        }
        System.out.println();

        System.out.print("Checking static variable and method...");
        if (Point.getNumOfPoints() == 2) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED!");
        }
        System.out.println();

        System.out.print("Checking setxCoor and setyCoor method...");
        p1.setxCoor(1);
        p1.setyCoor(2);
        if (p1.getxCoor() == 1 && p1.getyCoor() == 2) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED!");
        }
        System.out.println();

        System.out.print("Checking setCoor method...");
        p1.setCoor(3, 4);
        if (p1.getxCoor() == 3 && p1.getyCoor() == 4) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED!");
        }
        System.out.println();

        System.out.print("Checking goHome method...");
        p1.goHome();
        if (p1.getxCoor() == 0 && p1.getyCoor() == 0) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED!");
        }
        System.out.println();

        System.out.print("Checking move method...");
        p2.move(3, 4);
        if (p2.getxCoor() == 0 && p2.getyCoor() == 0) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED!");
        }
        System.out.println();

        System.out.print("Checking distance method...");
        Point p3 = new Point(3, 4);
        if (p3.distance(p1) == 5) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED!");
        }
        System.out.println();

        System.out.print("Checking toString method...");
        if (p3.toString().equals("(3,4)")) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED!");
            System.out.println("Expected output: (3,4)");
            System.out.println("Your output: " + p3);
        }
        System.out.println();

        System.out.print("Checking equals method...");
        if (p1.equals(p2) && !p1.equals(p3)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED!");
            System.out.println("Expected output: (3,4)");
            System.out.println("Your output: " + p3);
        }
        System.out.println();

        System.out.println("END of TEST");
    }
}