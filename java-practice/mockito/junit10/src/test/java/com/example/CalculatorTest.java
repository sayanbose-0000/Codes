package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CalculatorTest {
  private Calculator c;

  @BeforeEach
  public void before() {
    c = Mockito.mock(Calculator.class);
  }

  @Test
  public void testAdd() {
    when(c.add(2, 5)).thenReturn(7);

    assertEquals(7, c.add(2, 5));
  }
}
