// Write a program to show Fibonacci series up to n-th terms using recursion

import java.util.Scanner;

class FibonacciRec {
  static int fib(int n) {
    if (n == 0 || n == 1) return 1;
    return fib(n-1) + fib(n-2);
  }

  public static void main(String[] args) {
    System.out.print("Enter number: ");

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(fib(n));
  }
}

// 1 2 3 5 8