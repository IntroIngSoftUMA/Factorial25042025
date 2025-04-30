# Factorial Project

A simple Java class for computing the factorial of a non-negative integer, with input validation and custom exception handling. Designed for clarity, correctness, and safety against integer overflow.

## Features

- Computes factorial values for integers from `0` to `12`.
- Throws specific exceptions for invalid input:
    - `NegativeValueException` if the input is negative.
    - `ValueTooBigException` if the input is greater than `12` (to prevent `int` overflow).
- Uses an efficient iterative approach for computation.
- Includes JUnit 5 test coverage for correct values and exception cases.

## Requirements

- Java 17 or later
- Maven 
- JUnit 5 for running the tests

## Usage

### Factorial Computation

```java
import org.iis.Factorial;

public class Main {
  public static void main(String[] args) {
    Factorial factorial = new Factorial();
    int result = factorial.compute(5);  // result is 120
    System.out.println("5! = " + result);
  }
}
```

