package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTestTwo {
  private Calculator c;

  // Arrange
  @Before
  public void before() {
    c = new Calculator();
  }

  @After
  public void after() {
    c = null;
  }

  @Test
  public void addTest() {
    int res = c.add(1, 2);
    assertEquals(1 + 2, res);
  }

  @Test
  public void subtractTest() {
    int res = c.subtract(1, 2);
    assertEquals(1 - 2, res);
  }
}
