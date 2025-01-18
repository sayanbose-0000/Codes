// prime numbers in a range

import java.util.Scanner;
import java.lang.Math;

class PrimeNosInRange {
  static void isPrime(int n) {
    int count = 0;

    for (int i = 2; i < Math.pow(n, 0.5); i++) {
      if (n % i == 0) {
        count++;
        break;
      }
    }

    System.out.print(count == 0 ? " " + n : "");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter no: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n ; i++) {
      isPrime(i);
    }
  }
}