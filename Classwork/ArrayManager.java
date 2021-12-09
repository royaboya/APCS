package Classwork;

import java.util.Scanner;

public class ArrayManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        String[] strings = { "Alan", "Beth", "Calvin", "Daisy", null, null, null, null };

        while (!s.equals("5")) {
            System.out.println(
                    "\nChoices: \n 1. Display the Array \n 2. Remove an element at index \n 3. Add a String element to index 0 \n 4. Insert a String element to input index \n 5. Exit the Program");

            s = sc.nextLine();

            if (s.equals("1")) {
                System.out.println("Displayed Array:");
                displayArray(strings);
            } else if (s.equals("2")) {
                /**
                 * choice 2 makes the prompt print out twice but at this point i'm too lazy to
                 * care
                 */
                System.out.println("Which element do you want to remove?: ");
                int idx = sc.nextInt() - 1;
                removeAtIndex(strings, idx);
                displayArray(strings);
            }

            else if (s.equals("3")) {
                System.out.println("What do you want to add?: ");
                String name = sc.nextLine();
                insertAtStart(strings, name);
                displayArray(strings);
            }

            else if (s.equals("4")) {
                System.out.println("What index do you want to insert at? ");
                int n = sc.nextInt();
                insertAtIndex(strings, "test", n);
                displayArray(strings);
            }

        }
        sc.close();
    }

    public static void removeAtIndex(String[] strs, int index) {
        if (strs[index] == null) {
            System.out.println("No element found at index " + index + "!");
            return;
        }
        for (int i = index; i < strs.length - 1; i++) {
            strs[i] = strs[i + 1];
        }
        strs[strs.length - 1] = null;
    }

    public static void insertAtStart(String[] strs, String name) {
        // if (strs[strs.length - 1] != null) {
        // System.out.println("No element found!");
        // return;
        // }
        for (int i = strs.length - 1; i > 0; i--) {
            strs[i] = strs[i - 1];
        }
        strs[0] = name;
    }

    public static void insertAtIndex(String[] strs, String name, int index) {
        if (strs[strs.length - 1] != null) {
            System.out.println("Array is Full");
        }
        for (int i = strs.length - 1; i > index; i--) {
            strs[i] = strs[i - 1];
        }
        strs[index] = name;

    }

    public static void displayArray(String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] == null) {
                break;
            }
            System.out.println(String.format("%1$s. %2$s", i + 1, strs[i]));
        }
        System.out.println("===========================================");
    }
}
