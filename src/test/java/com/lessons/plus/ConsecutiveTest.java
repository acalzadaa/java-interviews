package com.lessons.plus;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ConsecutiveTest {

  @Test
  public void findTest() {
      assertEquals(Consecutive.find(new int[]{1,6}),4);
      assertEquals(Consecutive.find(new int[]{}),0);
      assertEquals(Consecutive.find(new int[]{1,2}),0);
  }
}
