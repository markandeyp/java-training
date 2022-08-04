package junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    void sum() {
        int result = calculator.sum(10, 20);
        Assertions.assertEquals(30, result);
    }

    @Test
    void sub() {
        int result = calculator.sub(35, 15);
        Assertions.assertEquals(20, result);
    }

    @Test
    void multiply() {
        int result = calculator.multiply(5, 7);
        Assertions.assertEquals(35, result);
    }

    @Test
    void divide() {
        int result = calculator.divide(20, 2);
        Assertions.assertEquals(10, result);
    }
}