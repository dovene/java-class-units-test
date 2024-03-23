package tests_lesson;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        // Given
        int a = 1;
        int b = 11;
        // When
        int result = new Calculator().add(a, b);
        // Then
        assertTrue(result == 12);
    }
}
