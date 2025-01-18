// Write a program to find the roots of the quadratic equation ax^2 + bx + c = 0 where a, b and c are constants

// Root = -b ± root(b^2 - 4ac) / 2a

import java.util.Scanner;
import java.lang.Math;

class QuadraticRoots {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a: ");
    double a = sc.nextInt();

    System.out.print("Enter b: ");
    double b = sc.nextInt();

    System.out.print("Enter c: ");
    double c = sc.nextInt();

    System.out.println(a + "x^2 + " + b + "x + " + c);

    double det = Math.pow(b, 2) - (4 * a * c);

    if (det > 0) {
      System.out.print("Two roots Present: ");
      double root1 = ((-1 * b) + Math.pow(det, 0.5)) / (2 * a);
      double root2 = ((-1 * b) - Math.pow(det, 0.5)) / (2 * a);
      System.out.println(root1 + ", " + root2);
    }

    if (det ==  0) {
      System.out.print("One root Present: ");
      double root = ((-1 * b) + Math.pow(det, 0.5)) / (2 * a);
      System.out.println(root);
    }

    if (det < 0) {
      System.out.print("Two roots Present: ");
      double realPart = (-1 * b) / (2 * a);
      double imgPart = Math.pow((-1 * det), 0.5) / (2 * a);
      System.out.print(realPart + " + " + imgPart + "i and ");
      System.out.println(realPart + " - " + imgPart + "i");
    }
  }
}