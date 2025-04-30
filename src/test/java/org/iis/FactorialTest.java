package org.iis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/*
 Test cases:
 0 - 1
 1 - 1
 2 - 2
 3 - 6
 4 - 24
 7 - 5040
 12 - 479001600

 -1 - throw an exception
 > 12 - throw an exception
 ...
*/
@DisplayName("Test cases for class Factorial")
class FactorialTest {
  private Factorial factorial;

  @BeforeEach
  void setup() {
    // Arrange
    factorial = new Factorial();
  }

  @Nested
  @DisplayName("The compute() method works properly in these cases:")
  class TestCasesForCorrectFactorials {

    @ParameterizedTest(name = "Factorial of {0} is {1}")
    @CsvSource({
            "0, 1",
            "1, 1",
            "2, 2",
            "3, 6",
            "4, 24",
            "7, 5040",
            "12, 479001600"
    })
    @DisplayName("Cases: ")
    void shouldReturnCorrectFactorial(int input, int expected) {
      // Act
      int obtainedValue = factorial.compute(input) ;

      // Assert
      assertEquals(expected, obtainedValue);
    }
  }

  @Nested
  @DisplayName("An exception is thrown when: ")
  class TestCasesForErrorDetection {

    @Test
    @DisplayName("The value is negative")
    void shouldComputeOfMinus1RaisesAnException() {
      // Act
      assertThrows(NegativeValueException.class, () -> factorial.compute(-1));
    }

    @Test
    @DisplayName("The value is greater than 12")
    void shouldThrowExceptionWhenInputIsTooBig() {
      // Act
      assertThrows(ValueTooBigException.class, () -> factorial.compute(13));
    }
  }
}
