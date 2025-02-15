package testingexceptionhandling;

import com.exceptionhandling.ExceptionHandling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestingExceptionHandling {
    ExceptionHandling mathUtils = new ExceptionHandling();

    @Test
    public void divideByNonZeroTest() {
        assertEquals(5, mathUtils.divide(10, 2), "10 / 2 should be 5");
        assertEquals(-3, mathUtils.divide(-9, 3), "-9 / 3 should be -3");
    }

    @Test
    public void divideByZeroShouldThrowException() {
        Exception exception = assertThrows(ArithmeticException.class, () -> mathUtils.divide(10, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
