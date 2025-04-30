package org.iis;

/**
 * The {@code Factorial} class provides a method to compute the factorial of a non-negative integer.
 *
 * <p>The factorial of a number {@code n} is defined as:
 * <ul>
 *   <li>{@code 0! = 1}</li>
 *   <li>{@code n! = n × (n - 1)!} for {@code n > 0}</li>
 * </ul>
 *
 * <p>This implementation uses an iterative approach for better performance and stack safety.
 * To prevent integer overflow, the maximum supported input is {@code 12}, since {@code 13!}
 * exceeds the range of a 32-bit signed {@code int}.
 *
 * <p>Invalid input values will result in custom exceptions being thrown.
 */
public class Factorial {

  /**
   * The largest input value for which the factorial can be computed without integer overflow.
   */
  private static final int MAX_SUPPORTED_INPUT = 12;

  /**
   * Computes the factorial of a non-negative integer.
   *
   * @param value the integer input for which to compute the factorial; must be in the range [0, 12]
   * @return the factorial of {@code value}
   * @throws NegativeValueException if {@code value} is negative
   * @throws ValueTooBigException if {@code value} is greater than {@value MAX_SUPPORTED_INPUT}
   */
  public int compute(int value) {
    if (value < 0) {
      throw new NegativeValueException("The parameter value is negative: " + value);
    }
    if (value > MAX_SUPPORTED_INPUT) {
      throw new ValueTooBigException("The parameter value is greater than " + MAX_SUPPORTED_INPUT + ": " + value);
    }

    int result = 1;
    for (int i = 2; i <= value; i++) {
      result *= i;
    }
    return result;
  }
}