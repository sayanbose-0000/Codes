// Write a Program of Sum of Series (1+x+x^2+x^3+x^4+………… up to n-th terms).

import java.util.Scanner;
import java.lang.Math;

class SeriesTwo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter x: ");
    int x = sc.nextInt();

    System.out.print("Enter n: ");
    int n  = sc.nextInt();

    int res = 0;

    for (int i = 0; i <= n; i++) {
      res += Math.pow(x, i);
    }

    System.out.println(res);
  }
}