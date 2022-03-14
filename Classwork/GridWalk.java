package Classwork;

public class GridWalk {
    // 6x6
    public static int[][] grid = {
            { 0, 1, 0, 0, 0, 0 },
            { 0, 0, 1, 0, 0, 1 },
            { 0, 0, 0, 0, 1, 0 },
            { 0, 0, 1, 0, 0, 0 },
            { 1, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 1, 0, 0 } };

    public static void main(String[] args) {
        if (checkPath(0, 0)) {
            System.out.println("Path Found, Printed in reversed order.");
        } else {
            System.out.println("No Path Exist");
        }
    }

    public static boolean checkPath(int row, int col) {
        // Add your code here
        if (row == 5 && col == 5) {
            return true;
        }

        if (row < grid.length - 1 && grid[row + 1][col] == 0) {
            System.out.println("going down");
            if (checkPath(row + 1, col))
            return true;
        }

        if (col < grid.length - 1 && grid[row][col + 1] == 0) {
            System.out.println("going right");
            if (checkPath(row, col + 1))
            return true;
        }

        return false;

    }
}