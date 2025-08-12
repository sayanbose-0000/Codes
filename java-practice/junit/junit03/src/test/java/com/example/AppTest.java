package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
  /**
   * Rigorous Test :-)
   */
  // @Test
  // public void shouldAnswerWithTrue() {
  // assertTrue(true);
  // }

  @Test
  public void testAssertions() {
    assertEquals(5, 2 + 3);

    assertTrue(5 > 3);

    assertFalse(5 < 3);

    assertNull(null);

    assertNotNull(new Object());
  }
}
