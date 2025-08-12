package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorSubtractTest {
  Calculator c;

  @BeforeEach
  public void before() {
    c = new Calculator();
  }

  @Test
  public void subtractTest() {
    assertEquals(1 - 2, c.subtract(1, 2));
  }
}
