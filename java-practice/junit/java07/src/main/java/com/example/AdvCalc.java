package com.example;

public class AdvCalc {
  public int square(int a) {
    return (int) Math.pow(a, 2);
  }

  public int root(int a) {
    return (int) Math.pow(a, 0.5);
  }

  public int floor(double a) {
    return (int) Math.floor(a);
  }

  public int ceil(double a) {
    return (int) Math.ceil(a);
  }
}
