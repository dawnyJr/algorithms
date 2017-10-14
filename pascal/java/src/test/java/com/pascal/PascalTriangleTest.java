package com.pascal;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PascalTriangleTest {

  @Test
  public void testPascal() {
    PascalTriangle t = new PascalTriangle();

    assertEquals(t.pascal(0, 0), 1);

    try {
      t.pascal(-1, 100);
    } catch (IllegalArgumentException e) {
      assertEquals(e.getMessage(), "Such input cannot be calculated !");
    }

    try {
      t.pascal(3, 4);
    } catch (IllegalArgumentException e) {
      assertEquals(e.getMessage(), "Such input cannot be calculated !");
    }

    assertEquals(t.pascal(100, 100), 1);

    assertEquals(t.pascal(100, 0), 1);
    
    assertEquals(t.pascal(5, 3), 10);
  }

}
