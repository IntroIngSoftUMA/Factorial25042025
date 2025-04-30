package org.iis;

/**
 * The {@code Factorial} class provides a method to compute the factorial of a non-negative integer
 * using recursion.
 *
 * <p>The factorial of a number {@code n} is defined as:
 *
 * <ul>
 *   <li>{@code 0! = 1}
 *   <li>{@code n! = n * (n - 1)!} for {@code n > 0}
 * </ul>
 */
public class Factorial {
  /**
   * Computes the factorial of a non-negative integer.
   *
   * @param value the non-negative integer whose factorial is to be computed
   * @return the factorial of {@code value}
   * @throws RuntimeException if {@code value} is negative
   */
  private static final int MAX_SUPPORTED_INPUT = 12;

  public int compute(int value) {
    if (value < 0) {
      throw new NegativeValueException("The parameter value is negative: " + value);
    } else if (value > MAX_SUPPORTED_INPUT) {
      throw new ValueTooBigException("The parameter value is greater than 12: " + value);
    }

    int result;
    if (value == 0) {
      result = 1;
    } else {
      result = 1;
      for (int i = 2; i <= value; i++) {
        result *= i;
      }
    }
    return result;
  }
}
