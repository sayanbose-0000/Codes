package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenCheckerTest {
  EvenChecker e;

  @BeforeEach // Equivalent to @Before of Junit4, we are using Junit5 here
  public void before() {
    e = new EvenChecker();
  }

  @AfterEach // Equivalent to @After of Junit4, we are using Junit5 here
  public void after() {
    e = null;
  }

  @ParameterizedTest
  @ValueSource(ints = { 2, 4 })
  public void isEvenTest(int number) {
    assertTrue(e.isEven(number));
  }

  @ParameterizedTest
  @ValueSource(ints = { 1, 3 })
  public void isOddTest(int number) {
    assertFalse(e.isEven(number));
  }
}
