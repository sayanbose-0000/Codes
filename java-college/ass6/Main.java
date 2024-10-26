/* 

Create an interface containing three methods, in a package ‘pkgOne’. Implement the interface from a class under package
pkgTwo. From main, under working directory, create object of the class and call methods of interface.

*/

import pTwo.Cat;

class Main {
  public static void main (String[] args) {
    Cat c = new Cat();

    c.walk();
    c.talk();
    c.sleep();
  }
}