// Write a program to find the sum of digits of a given integer number (1st day using static i/p and 2nd day using command-line
// argument).

import java.util.Scanner;

class SumOfDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a: ");
    int a = sc.nextInt();

    int b = Integer.parseInt(args[0]);

    System.out.println("Res is: " + (a+b));
  }
}