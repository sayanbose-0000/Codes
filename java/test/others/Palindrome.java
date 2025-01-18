// Write a program to check whether a given integer number is palindrome or not (1st day using static i/p and 2nd day using com-
// mand-line argument)

import java.util.Scanner;

class Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number: ");
    int x = sc.nextInt();

    int y = x;
    int rev = 0;

    while (y != 0) {
      int temp = y % 10;
      rev = rev * 10 + temp;
      y = y / 10;
    }

    System.out.println(x == rev ? "Palindrome" : "Not Palindrome");
  }
}