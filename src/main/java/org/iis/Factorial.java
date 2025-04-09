package org.iis;

public class Factorial {
  public int compute(int value) {
    int result;
    if ((value == 0) || (value == 1)) {
      result = 1;
    } else if (value == 2) {
      result = 2;
    } else if (value == 3) {
      result = 6;
    } else if (value == 4) {
      result = 24;
    } else {
      result = value * compute(value - 1);
    }
    return result;
  }
}
