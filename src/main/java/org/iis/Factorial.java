package org.iis;

public class Factorial {
  public int compute(int value) {
    int result;
    if (value == 0) {
      result = 1;
    } else {
      result = value * compute(value - 1);
    }
    return result;
  }
}
