package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdvCalcTestSquare {
  private AdvCalc c;
  @BeforeEach
  public void before() {
    c = new AdvCalc();
  }

  @Test
  public void testSquare() {
    int res = c.square(10);

    assertEquals((int) Math.pow(10, 2), res);
  }
}
