// Write a program to read the price of an item in the decimal form (like 75.95) and print the output in paise (like 7595 paise).

import java.util.Scanner;

class RsToP {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Rs.: ");
    float rs = sc.nextFloat();

    System.out.println("Money is Rs: " + rs * 100);
  }
}