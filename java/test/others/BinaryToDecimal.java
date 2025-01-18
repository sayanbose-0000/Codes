// Convert binary to decimal

import java.util.Scanner;
import java.lang.Math;

class BinaryToDecimal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter binary: ");
    StringBuilder input = new StringBuilder(sc.next());

    String[] bin = input.toString().split("");

    double res = 0;

    int c = 0;
    for (int i = bin.length - 1; i >= 0; i--) {
      res += Math.pow(2, c) * Integer.parseInt(bin[i]);
      c++;
    }

    System.out.println(res);

    sc.close();
  }
}