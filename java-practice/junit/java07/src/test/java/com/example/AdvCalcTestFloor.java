package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdvCalcTestFloor {
  private AdvCalc c;

  @BeforeEach
  void before() {
    c = new AdvCalc();
  }

  @Test
  public void testFloor() {
    int res = c.floor(1.36);

    assertEquals((int) Math.floor(1.36), res);
  }
}
