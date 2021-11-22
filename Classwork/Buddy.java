package Classwork;

import java.util.Scanner;

public class Buddy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;

        while (i != 3) {
            System.out.println("Choose one of the three options: 1. Say Hi 2. Give a hug 3. Exit");
            i = sc.nextInt();
            if (i == 1) {
                System.out.println("Hi!");
            } else if (i == 2) {
                System.out.println("Big Hug!");
            }
        }
        System.out.println("Goodbye!");
        sc.close();
    }
}
