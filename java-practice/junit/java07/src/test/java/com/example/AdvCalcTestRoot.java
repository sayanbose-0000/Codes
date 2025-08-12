package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdvCalcTestRoot {
  private AdvCalc c;

  @BeforeEach
  void before() {
    c = new AdvCalc();
  }

  @Test
  public void testRoot() {
    int res = c.root(10);

    assertEquals((int) Math.pow(10, 0.5), res);
  }
}
