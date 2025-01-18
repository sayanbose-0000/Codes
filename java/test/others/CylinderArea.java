// Write a program to find Area and Circumference of Cylinder Using Constructors - Keyboard Input or Command Line Input

// Area = PI * r ^ h
// SA = (2 * PI * r ^ 2) + (2 * PI * r * h)

import java.util.Scanner;
import java.lang.Math;

class CylinederArea {
  static final double PI = 3.14;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter height: ");
    double h = sc.nextDouble();

    System.out.print("Enter radius: ");
    double r = sc.nextDouble();

    System.out.println("Surface Area: " + ((2 * PI * Math.pow(r, 2)) + (2 * PI * r * h)));
    System.out.println("Voume: " + PI * Math.pow(r, 2) * h);
  }
}