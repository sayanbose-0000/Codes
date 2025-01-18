// Write a program to find Area and Volume of Cone Using Constructors - Keyboard Input or Command Line Inpu
// area = pi * r * (r + l)
// vol = 1/3 * pi * r ^ 2 * h

import java.util.Scanner;

class ConeHelper {
  double l, r, h;
  static final double PI = 3.14;

  ConeHelper(double l, double r, double h) {
    this.l = l;
    this.r = r;
    this.h = h;
  }

  void area() {
    System.out.println("Area is: " + PI * r * (r + l));
  }

  void volume() {
    System.out.println("Area is: " + (0.33 * PI * Math.pow(r, 2) * h));
  }
}

class Cone {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double l = sc.nextDouble();
    double r = sc.nextDouble();
    double h = sc.nextDouble();

    ConeHelper c = new ConeHelper(l, r, h);
    c.area();
    c.volume();

  }
}