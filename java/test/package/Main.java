// Create a class with variable(s) and method(s) (all will be default accessed) under package pOne. Now create a class under pack-
// age pTwo, which is subclass of firstly created class. In the method here (i.e. class of pTwo) call variable(s) and method(s) of pre-
// vious class (i.e. class of pOne). If errors come, rectify them. Now from Main (under working directory) access second class’s
// members.

import pOne.PackageOne;
import pTwo.PackageTwo;

public class Main {
  public static void main(String[] args) {
    PackageOne p1 = new PackageOne();
    PackageTwo p2 = new PackageTwo();

    p1.pOneShow();
    System.out.println("---");
    p2.pTwoShow();
  }
}