package Classwork.Sorting;

public class insertionSortTest {
    public static void main(String[] args) {
        int[] a = { 6, 2, 4, 8, 1, 3, 5 };
        displayArr(a);
        insertionSort(a);
        displayArr(a);
    }

    public static void displayArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1]);
    }

    public static void insertionSort(int[] arr) {
        // insert your code here

        // sorted part begins before arr[1]
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];

            int j = i - 1;

            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--; // huh????
            }

            arr[j + 1] = temp;

        }
    }

}
