package tests_lesson;

import java.util.Arrays;

public class Calculator {
    public int addUsingRepository(CalculatorRepository calculatorRepository) {
        return Arrays.stream(calculatorRepository.getOperands()).sum();
    }

    public int substractUsingRepository(CalculatorRepository calculatorRepository) {
        int[] data = calculatorRepository.getOperands();
        return data[0] - data[1];
    }

    public int multiplyUsingRepository(CalculatorRepository calculatorRepository) {
        int[] data = calculatorRepository.getOperands();
        return data[0] * data[1];
    }

    public int divideByusingRepository(CalculatorRepository calculatorRepository) {
        int[] data = calculatorRepository.getOperands();
        if (data[1] == 0){
            throw new ArithmeticException();
        }
        return data[0] / data[1];
    }

    public int add(int a, int b) {
        return a + b;
    }
}
