package Classwork.Coin;

//testing class built by Huo Chen; Last Update 11/5/2018
//updated 12/1/2021 included test and duplicate methods

public class CoinTester {
    public static void main(String[] args) {
        boolean checkTrue = false;
        boolean checkFalse = false;

        System.out.println("Constructing a Coin called c1 using no-arges constructor...");
        Coin c1 = new Coin();
        System.out.println("PASSED!");
        System.out.println();

        System.out.println("Constructing a Coin called c2 using parameterized constructor...");
        Coin c2 = new Coin(true);
        System.out.println("PASSED!");
        System.out.println();

        System.out.println("Checking c2 instant variables");
        if (c2.isHead()) {
            System.out.println("PASSED!");
        } else {
            System.out.println("FAILED :(");
        }
        System.out.println();

        System.out.println("Checking toss method...");
        checkTrue = false;
        checkFalse = false;

        for (int i = 0; i <= 100; i++) {
            if (c1.toss() && c1.isHead()) {
                checkTrue = true;
            } else if (!c1.toss() && !c1.isHead()) {
                checkFalse = true;
            }
        }
        if (checkTrue && checkFalse) {
            System.out.println("PASSED: Toss generates random results");
        } else {
            System.out.println("FAILED!!!: Toss Does Not generates random results");
        }
        System.out.println();

        System.out.println("Checking toString method...");
        checkTrue = false;
        checkFalse = false;
        for (int i = 0; i <= 100; i++) {
            c1.toss();
            if (c1.toString() == "Head") {
                checkTrue = true;
            } else if (c1.toString() == "Tail") {
                checkFalse = true;
            } else {
                System.out.println("FAILED!!!: toString method generates unwanted result");
                break;
            }
        }
        if (checkTrue && checkFalse) {
            System.out.println("PASSED: toString method passed");
        } else {
            System.out.println("FAILED!!!: toString method failed");
        }
        System.out.println();

        Coin c3 = new Coin(true);
        Coin c4 = new Coin(false);
        System.out.println("Checking equals method");
        if (c2.equals(c3) && !c2.equals(c4)) {
            System.out.println("PASSED: equals method");
        } else {
            System.out.println("FAILED!!!: equals method");
        }
        System.out.println();

        System.out.println("Checking test method...");
        double testResult = c1.test(10000);
        if (testResult >= 0.4 && testResult <= 0.6) {
            System.out.println("PASSED!");
        } else {
            System.out.println("FAILED: value should be close to 0.5; your value is " + testResult);
        }
        System.out.println();

        System.out.println("Checking getNumOfCoins method...");
        if (Coin.getNumOfCoins() == 4) {
            System.out.println("PASSED!");
        } else {
            System.out.println("FAILED :(");
        }
        System.out.println();

        System.out.println("Checking duplicate method...");
        if (Coin.duplicate(c3).isHead() && !Coin.duplicate(c4).isHead()) {
            System.out.println("PASSED!");
        } else {
            System.out.println("FAILED :(");
        }
        System.out.println();

        System.out.println("END of TEST");
    }
}
