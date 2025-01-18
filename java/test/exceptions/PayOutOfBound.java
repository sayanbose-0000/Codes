// Write a program to create a user defined exception named PayOutOfBoundsException (provided the monthly salary of a per-
// son is less than Rs. 10,000 /-) and fire the exception

import java.util.Scanner;

class PayOutOfBoundsException extends Exception {
  PayOutOfBoundsException(String s) {
    super(s);
  }
}

class PayOutOfBound {
  public static void main(String[] args) throws PayOutOfBoundsException {
    Scanner sc = new Scanner(System.in);

    int amount = sc.nextInt();

    if (amount  < 10000) {
      throw new PayOutOfBoundsException("Poisa de!");
    }

    else {
      System.out.println("Thik ache ja ja");
    }
  }
}