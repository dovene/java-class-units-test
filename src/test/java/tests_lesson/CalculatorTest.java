package tests_lesson;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {
    @Mock
    private CalculatorRepository calculatorRepository;

    @InjectMocks
    Calculator calculator;

    @Test
    public void testAddUsingRepository() {
        // Given
        int[] operands = { 1, 2 };
        when(calculatorRepository.getOperands()).thenReturn(operands);
        // When
        int result = calculator.addUsingRepository(calculatorRepository);
        // Then
        assertTrue(result == 3);
        verify(calculatorRepository, times(1)).getOperands();
    }

    @Test
    public void testMultiplyUsingRepository() {
        // Given
        int[] operands = { 4, 2 };
        when(calculatorRepository.getOperands()).thenReturn(operands);
        // When
        int result = calculator.multiplyUsingRepository(calculatorRepository);
        // Then
        assertTrue(result == 8);
        verify(calculatorRepository, times(1)).getOperands();
    }

    @Test
    public void testSubstractUsingRepository() {
        // Given
        int[] operands = { 10, 2 };
        when(calculatorRepository.getOperands()).thenReturn(operands);
        // When
        int result = calculator.substractUsingRepository(calculatorRepository);
        // Then
        assertTrue(result == 8);
        verify(calculatorRepository, times(1)).getOperands();
    }

    @Test
    public void testDividebyUsingRepository() {
        // Given
        int[] operands = { 14, 2 };
        when(calculatorRepository.getOperands()).thenReturn(operands);
        // When
        int result = calculator.divideByusingRepository(calculatorRepository);
        // Then
        assertTrue(result == 7);
        verify(calculatorRepository, times(1)).getOperands();
    }

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
