package org.princefisher;

public class HelloWorld {
  private boolean isGoodDay;

  public HelloWorld(boolean isGoodDay) {
    this.isGoodDay = isGoodDay;
  }

  @Override
  public String toString() {
    var sb = new StringBuilder();
    boolean isAGoodDay = false;
    if (isGoodDay) {
      sb.append("HelloWorld, today is a good day!");
    } else {
      sb.append("The apocalypse is near...");
    }
    return sb.toString();
  }
}
