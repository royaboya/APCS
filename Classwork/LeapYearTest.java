public class LeapYearTest {
  public static void main(String[] args) {
    int y = 1988;
    System.out.print("Checking " + y + "...");
    if (isLeapYear(y)) {
      System.out.println("pass!");
    } else {
      System.out.println("failed!");
    }

    y = 1985;
    System.out.print("Checking " + y + "...");
    if (!isLeapYear(y)) {
      System.out.println("pass!");
    } else {
      System.out.println("failed!");
    }

    y = 1992;
    System.out.print("Checking " + y + "...");
    if (isLeapYear(y)) {
      System.out.println("pass!");
    } else {
      System.out.println("failed!");
    }

    y = 1993;
    System.out.print("Checking " + y + "...");
    if (!isLeapYear(y)) {
      System.out.println("pass!");
    } else {
      System.out.println("failed!");
    }

    y = 1600;
    System.out.print("Checking " + y + "...");
    if (isLeapYear(y)) {
      System.out.println("pass!");
    } else {
      System.out.println("failed!");
    }

    y = 1700;
    System.out.print("Checking " + y + "...");
    if (!isLeapYear(y)) {
      System.out.println("pass!");
    } else {
      System.out.println("failed!");
    }

    y = 2000;
    System.out.print("Checking " + y + "...");
    if (isLeapYear(y)) {
      System.out.println("pass!");
    } else {
      System.out.println("failed!");
    }

    y = 2100;
    System.out.print("Checking " + y + "...");
    if (!isLeapYear(y)) {
      System.out.println("pass!");
    } else {
      System.out.println("failed!");
    }
  }

  // Write your isLeapYear method here.
  public static boolean isLeapYear(int year) {
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          return true;
        }
        return false;
      }
      return true;
    }
    return false;
  }
}
