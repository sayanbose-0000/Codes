// Write a program to calculate the Simple Interest (si) while your inputs are principle (p), time in years (n) and rate of interest (r).

import java.util.Scanner;

class SimpleInterest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter p: ");
    double p = sc.nextDouble();

    System.out.print("Enter n: ");
    double y = sc.nextDouble();

    System.out.print("Enter r: ");
    double r = sc.nextDouble();

    System.out.println("Simple interest is: " + (p * y * r));
  }
}