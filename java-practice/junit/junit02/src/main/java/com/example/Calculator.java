package com.example;

public class Calculator {
  int add(int a, int b) {
    return a + b;
  }

  int substract(int a, int b) {
    return a - b;
  }

  int multiply(int a, int b) {
    return a * b;
  }

  int divide(int a, int b) {
    if (b == 0)
      throw new ArithmeticException();

    return a / b;
  }
}
