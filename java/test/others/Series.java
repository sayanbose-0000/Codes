// Write a program to determine sum of the following series for given value of n:
// 1 - 1/2^2 + 1/3^2 + ... + 1/n^2
import java.util.Scanner;
import java.lang.Math;

class Series {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter n: ");
    int n = sc.nextInt();

    double res = 0;

    for (int i = 1; i <= n; i++) {
      res += Math.pow((-1),  i+1) / Math.pow(i, 2);
    }

    System.out.println("Res is: " + res);
  }
}