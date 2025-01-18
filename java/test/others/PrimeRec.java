// WAP to check whether a number is prime or not using recursion.

import java.util.Scanner;

class PrimeRec {
  static int isPrime(int n, int i, int c) {
    if (i == 0) {
      if (c == 2) System.out.println("Prime");
      else System.out.println("Non-Prime");
    }

    if (i == 0) return 0;

    if (n % i == 0) c++;

    return isPrime(n, i-1, c);
  }

  public static void main(String[] args) {
    System.out.print("Enter number: ");

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    isPrime(n, n, 0);
  }
}