package pTwo;

import pOne.Animal;

public class Cat implements Animal {
  public void talk() {
    System.out.println("Cat is talking");
  }

  public void walk() {
    System.out.println("Cat is walking");
  }

  public void sleep() {
    System.out.println("Cat is sleeping");
  }
}