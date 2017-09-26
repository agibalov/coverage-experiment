package me.loki2302;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void canAddNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void canDivideNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(5, 2));
    }

    @Test(expected = RuntimeException.class)
    public void divisionByZeroThrows() {
        Calculator calculator = new Calculator();
        calculator.divide(5, 0);
    }
}
