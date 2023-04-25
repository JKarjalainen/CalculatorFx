import com.example.calculatorfx.models.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {
    private static Calculator calculator;

    @BeforeAll
    public static void setUp() {
        calculator = new Calculator();
    }
    @BeforeEach
    public void reset() {
        calculator.reset();
    }

    @Test
    public void testAdd() {
        calculator.add(1);
        calculator.add(2);
        assertEquals(3, calculator.getValue());
    }

    @Test
    public void testSubtract() {
        calculator.subtract(1);
        calculator.subtract(2);
        assertEquals(-3, calculator.getValue());
    }

    @Test
    public void testMultiply() {
        calculator.add(1);
        calculator.multiply(2);
        assertEquals(2, calculator.getValue());
    }

    @Test
    public void testDivide() {
        calculator.add(1);
        calculator.divide(2);
        assertEquals(0.5, calculator.getValue());
    }

    @Test
    public void testReset() {
        calculator.add(1);
        calculator.reset();
        assertEquals(0, calculator.getValue());
    }
}
