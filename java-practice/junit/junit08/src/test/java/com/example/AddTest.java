package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AddTest {
  private Add a;

  @BeforeEach
  public void before() {
    a = new Add();
  }

  @AfterEach
  public void after() {
    a = null;
  }

  @Order(value = 1)
  @Test
  public void addTest01() {
    int res = a.add(10, 20);
    assertEquals(10 + 20, res);
  }

  @Order(value = 5)
  @Test
  public void addTest02() {
    int res = a.add(30, 40);
    assertEquals(30 + 40, res);
  }

  @Order(value = 3)
  @Test
  public void addTest03() {
    int res = a.add(50, 60);
    assertEquals(50 + 60, res);
  }

  @Order(value = 2)
  @Test
  public void addTest04() {
    int res = a.add(70, 80);
    assertEquals(70 + 80, res);
  }

  @Order(value = 4)
  @Test
  public void addTest05() {
    int res = a.add(90, 100);
    assertEquals(90 + 100, res);
  }
}
