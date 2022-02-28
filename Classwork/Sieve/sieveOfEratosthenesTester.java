package Classwork.Sieve;

//Huo Chen 2/14/2022
import java.util.ArrayList;

public class sieveOfEratosthenesTester {
  public static ArrayList<Integer> sieveOfEratosthenes(int n) {
    // add your code here
    ArrayList<Integer> arr = new ArrayList<>();
    for (int i = 2; i < n; i++) {
      arr.add(i);
    }
    System.out.println(arr);

    for (int i = 0; i < arr.size(); i++) {
        for (int j = arr.size() - 1; j > i; j--) {
          if (arr.get(j) % arr.get(i) == 0) {
            arr.remove(j);
          }
        }
      }

    return arr;
  }

  public static void main(String[] args) {
    int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
        101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211,
        223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347,
        349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467,
        479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617,
        619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761,
        769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919,
        929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997 };

    boolean valid = true;

    System.out.println("Checking in progress");

    ArrayList<Integer> result = sieveOfEratosthenes(1000);
    for (int i = 0; i < primes.length; i++) {
      if (primes[i] != result.get(i)) {
        System.out.println("ERROR: Answer: " + primes[i] + " Your answer: " + result.get(i));
        valid = false;
      }
    }
    if (valid) {
      System.out.println("You got it!");
    } else {
      System.out.println("There are some problems with your results");
    }
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