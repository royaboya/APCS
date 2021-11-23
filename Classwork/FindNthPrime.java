package Classwork;

public class FindNthPrime {
    public static void main(String[] args) {
        System.out.println(listPrimes(5));
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int nthPrime(int nth) {

        int count = 0;
        int i = 0;
        while (count < nth) {
            i++;
            if (isPrime(i)) {
                count++;
            }
        }
        return i;
    }

    public static String listPrimes(int n) {
        int count = 0;
        int i = 0;
        String s = "";
        while (count < n) {
            i++;
            if (isPrime(i)) {
                s += i + " ";
                count++;
            }
        }
        return s;
    }
}
