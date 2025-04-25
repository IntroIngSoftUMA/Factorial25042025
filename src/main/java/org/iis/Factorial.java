package org.iis;

/**
 * The {@code Factorial} class provides a method to compute
 * the factorial of a non-negative integer using recursion.
 *
 * <p>The factorial of a number {@code n} is defined as:
 * <ul>
 *   <li>{@code 0! = 1}</li>
 *   <li>{@code n! = n * (n - 1)!} for {@code n > 0}</li>
 * </ul>
 *
 */
public class Factorial {
  /**
   * Computes the factorial of a non-negative integer.
   *
   * @param value the non-negative integer whose factorial is to be computed
   * @return the factorial of {@code value}
   * @throws RuntimeException if {@code value} is negative
   */
  public int compute(int value) {
    if (value < 0) {
      throw new NegativeValueException("The parameter value is negative: " + value);
    } else if (value > 12) {
      throw new ValueTooBigException("The parameter value is greater than 12: " + value);
    }

    int result;
    if (value == 0) {
      result = 1;
    } else {
      result = value * compute(value - 1);
    }
    return result;
  }
}
