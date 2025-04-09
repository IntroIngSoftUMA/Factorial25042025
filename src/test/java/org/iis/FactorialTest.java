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
  void shouldFactorialOf1Return1() {
    // Arrange
    Factorial factorial = new Factorial();

    // Act
    int obtainedResult = factorial.compute(1);

    // Assert
    int expectedResult = 1;
    assertEquals(expectedResult, obtainedResult);
  }

  @Test
  void shouldFactorialOf2Return2() {
    // Arrange
    Factorial factorial = new Factorial();

    // Act
    int obtainedResult = factorial.compute(2);

    // Assert
    int expectedResult = 2;
    assertEquals(expectedResult, obtainedResult);
  }

  @Test
  void shouldFactorialOf3Return2() {
    // Arrange
    Factorial factorial = new Factorial();

    // Act
    int obtainedResult = factorial.compute(3);

    // Assert
    int expectedResult = 6;
    assertEquals(expectedResult, obtainedResult);
  }

  @Test
  void shouldFactorialOf4Return24() {
    // Arrange
    Factorial factorial = new Factorial();

    // Act
    int obtainedResult = factorial.compute(4);

    // Assert
    int expectedResult = 24;
    assertEquals(expectedResult, obtainedResult);
  }

  @Test
  void shouldFactorialOf7Return5040() {
    // Arrange
    Factorial factorial = new Factorial();

    // Act
    int obtainedResult = factorial.compute(7);

    // Assert
    int expectedResult = 5040;
    assertEquals(expectedResult, obtainedResult);
  }
}
