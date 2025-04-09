package org.iis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 Test cases:
 0 - 1
 1 - 1
 2 - 2
 3 - 6
 4 - 24
 7 - 5040
 ...
*/
class FactorialTest {
  @Test
  void shouldFactorialOf0Return1() {
    // Arrange
    Factorial factorial = new Factorial();

    // Act
    int obtainedResult = factorial.compute(0);

    // Assert
    int expectedResult = 1;
    assertEquals(expectedResult, obtainedResult);
  }

  @Test
  void shouldFactorial1f0Return1() {
    // Arrange
    Factorial factorial = new Factorial();

    // Act
    int obtainedResult = factorial.compute(1);

    // Assert
    int expectedResult = 1;
    assertEquals(expectedResult, obtainedResult);
  }
}
