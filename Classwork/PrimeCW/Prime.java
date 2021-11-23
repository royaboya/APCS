package Classwork.PrimeCW;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(3));
        System.out.println(isPrime(5));
        System.out.println(isPrime(7));
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

}
