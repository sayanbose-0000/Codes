package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExceptionThrowerTest {
  private ExceptionThrower et;

  @BeforeEach
  public void before() {
    et = new ExceptionThrower();
  }

  @AfterEach
  public void after() {
    et = null;
  }
  
  @Test
  public void test01() {
    try {
      int res = et.throwException(19);
      assertEquals(1, res);
    } catch(ZeroException ze) {
      System.out.println(et);
    }
  }

  @Test
  public void testO2() {
    assertThrows(ZeroException.class, () -> et.throwException(0));
  }
}
