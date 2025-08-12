package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
  Calculator c = new Calculator();

  @Test
  public void addTest() {
    assertEquals(1 + 2, c.add(1, 2));
  }

  @Test
  public void subtractTest() {
    assertEquals(1 - 2, c.substract(1, 2));
  }

  @Test
  public void multiplyTest() {
    assertEquals(1 * 2, c.multiply(1, 2));
  }

  @Test
  public void divideTest() {
    assertEquals(1 / 2, c.divide(1, 2));
  }
}
