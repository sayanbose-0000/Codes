package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdvCalcTestCeil {
  private AdvCalc c;

  @BeforeEach
  public void before() {
    c = new AdvCalc();
  }

  @Test
  public void testCeil() {
    int res = c.ceil(10.68);

    assertEquals((int) Math.ceil(10.68), res);
  }
}
