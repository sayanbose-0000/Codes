// WAP to print all Armstrong numbers within a given range.

// sum of individual digits equal to actual number

// 153 = 1^3 + 5^3 + 3^3
// 9474 = 9^4 + 4^4 + 7^4 + 4^4

import java.util.Scanner;
import java.lang.Math;

class Amstrong {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int temp = n;

    int digits = 0;
    while (temp != 0) {
      temp = temp / 10;
      digits++;
    }

    temp = n;
    double res = 0;

    while (temp != 0) {
      int t = temp % 10;
      res = res + Math.pow(t, digits);
      temp = temp/10;
    }

    System.out.println(res == n ? "Amstrong" : "Not amstrong");
  }
}