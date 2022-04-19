package org.princefisher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.princefisher.HelloWorld;

class HelloWorldTest {

  @Test
  void testGoodDay() {
    var cut = new HelloWorld(true);
//    assertTrue(cut.isGoodDay());
    assertEquals("HelloWorld, today is a good day!", cut.toString());
//    assertFalse(cut.isGoodDay());
  }

  @Test
  void testBadDay() {
    var cut = new HelloWorld(false);
//    assertEquals("The apocalypse is near...", cut.toString());
    assertEquals("you failed this mutation...", cut.toString());
  }
}