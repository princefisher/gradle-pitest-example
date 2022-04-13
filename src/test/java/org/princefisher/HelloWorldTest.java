package org.princefisher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.princefisher.HelloWorld;

class HelloWorldTest {

  @Test
  void testToString() {
    var cut = new HelloWorld(true);
    assertEquals("org.princefisher.HelloWorld, today is a good day!", cut.toString());
  }
}