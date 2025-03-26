package tests_lesson;

import java.util.Arrays;

public class Calculator {
    public int addUsingRepository(CalculatorRepository calculatorRepository) {
        return Arrays.stream(calculatorRepository.getOperands()).sum();
    }

    public int add(int a, int b) {
        return a + b;
    }
}
