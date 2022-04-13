package org.princefisher;

public class HelloWorld {
  private boolean isGoodDay;

  public HelloWorld(boolean isGoodDay) {
    this.isGoodDay = isGoodDay;
  }

  @Override
  public String toString() {
    var sb = new StringBuilder();
    if (isGoodDay) {
      sb.append("org.princefisher.HelloWorld, today is a good day!");
    } else {
      sb.append("The apocalypse is near...");
//      throw new RuntimeException("The apocalypse is near...");
    }
    return sb.toString();
  }
}
