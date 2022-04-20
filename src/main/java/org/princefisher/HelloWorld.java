package org.princefisher;

public class HelloWorld {
  private boolean isGoodDay;

  public HelloWorld(boolean isGoodDay) {
    this.isGoodDay = isGoodDay;
  }

  @Override
  public String toString() {
    var sb = new StringBuilder();
    if (isGoodDay()) {
      sb.append("HelloWorld, today is a good day!");
    } else {
      sb.append("The apocalypse is near...");
    }

    if (isGoodDay) {
      // everything is fine
      flip();
    } else {
      // not so fine anymore
      return "you failed this mutation...";
    }

    return sb.toString();
  }

  private void flip() {
    isGoodDay = !isGoodDay;
  }

  public boolean isGoodDay() {
    return isGoodDay;
  }
}
