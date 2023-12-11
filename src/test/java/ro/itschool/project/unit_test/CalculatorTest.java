package ro.itschool.project.unit_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ro.itschool.project.services.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    void testAddition_ShouldPass_WithValidInput() {
        //GIVEN
        int firstNumber = 3;
        int secondNumber = 15;
        int expectedResult = firstNumber + secondNumber;

        //WHEN
        int result = calculator.add(firstNumber, secondNumber);

        //THEN
        assertEquals(expectedResult, result, "Addition result should be equal to the expected result.");
    }

    @Test
    void testAddition_ShouldFail_WithResultExceedingIntegerMaxValue() {
        //GIVEN
        int firstNumber = Integer.MAX_VALUE;
        int secondNumber = 15;
        long expectedResult = (long)firstNumber + secondNumber;

        //WHEN
        int result = calculator.add(firstNumber, secondNumber);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result: " + result);

        //THEN
        assertNotEquals(expectedResult, result);
    }

    @Test
    void testSubtract_ShouldPass_WithValidInput() {
        //GIVEN
        int firstNumber = 15;
        int secondNumber = 12;
        int expectedResult = firstNumber - secondNumber;

        //WHEN
        int result = calculator.subtract(firstNumber, secondNumber);

        //THEN
        assertEquals(expectedResult, result, "The subtract result should be equal to the expected result.");
    }
}
