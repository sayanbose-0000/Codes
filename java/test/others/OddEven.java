// Write a Java Program to check if a number is Even or Odd

import java.util.Scanner;

class OddEven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter num: ");
    int x = sc.nextInt();

    if (x % 2 == 0) System.out.print("x is even");
    else System.out.print("x is odd");
  }
}