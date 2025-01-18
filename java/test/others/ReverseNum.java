// Write a program to find the reverse of a given integer number (1st day using static i/p and 2nd day using command-line argu-
// ment).

import java.util.Scanner;

class ReverseNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter x: ");
    int x = sc.nextInt();

    int y = x;
    int res = 0;

    while(y != 0) {
      int temp = y % 10;
      res = res * 10 + temp;
      y = y / 10;
    }

    System.out.println(res);
  }
}