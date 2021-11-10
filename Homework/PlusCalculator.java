import java.util.Scanner;

public class PlusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter an expression with one plus sign: ");
        String expression = sc.nextLine();
        sc.close();

        int plusIndex = expression.indexOf("+");

        Double numOne = Double.valueOf(expression.substring(0, plusIndex));
        Double numTwo = Double.valueOf(expression.substring(plusIndex));

        System.out.println(numOne + " + " + numTwo + " = " + (numOne + numTwo));

    }
}