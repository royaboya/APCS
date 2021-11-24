package Classwork;

import java.util.Scanner;

public class PrerequisitesCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a course: ");
        String s = sc.nextLine();

        switch (s) {
        case "APCS":
            System.out.println("Algebra 2");
        case "Algebra 2":
            System.out.println("Geometry");
        case "Geometry":
            System.out.println("Algebra 1");
            break;
        case "Algebra 1":
            System.out.println("No Prerequisites");
        default:
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
