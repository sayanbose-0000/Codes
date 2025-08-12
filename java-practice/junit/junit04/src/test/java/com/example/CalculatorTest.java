// AAA- Arrange, Act, Assert

package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
  private Calculator c;

  // ARRANGE
  @Before // Runs before every single test
  public void before() {
    c = new Calculator();
  }

  @After // Runs after every single test
  public void after() {
    c = null;
  }

  @Test
  public void addTest() {
    int res = c.add(1, 2); // ACT
    assertEquals(1 + 2, res); // ASSERT
  }

  @Test
  public void subtractTest() { 
    int res = c.subtract(1, 2); // ACT
    assertEquals(1 - 2, res); // ASSERT
  }
}
