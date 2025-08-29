import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {

    Calculator myCalc;

    @BeforeEach
    void setup()
    {
        myCalc = new Calculator();
    }
    @Test
    void testAddSuccess()
    {
        assertEquals(8, myCalc.add(4,4));
    }
    @Test
    void testAddFail()
    {
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> {myCalc.add(Integer.MAX_VALUE, 4);});
        assertEquals("This value is too big", ex.getMessage());
    }

    @Test
    void testSubtractionSuccess()
    {
        assertEquals(2, myCalc.subtract(6,4));
    }

    @Test
    void testSubtractFail()
    {
        Exception ex = assertThrows(IllegalStateException.class, () -> {myCalc.subtract(4,6);});
        assertEquals("Negative Results Are not allowed", ex.getMessage());
    }

    @Test
    void testMultiplySuccess()
    {
        assertEquals(20, myCalc.multiply(4, 5));
    }

    @Test
    void testMultiplyFail()
    {
        Exception ex = assertThrows(UnsupportedOperationException.class, () -> {myCalc.multiply(Integer.MAX_VALUE, 2);});
        assertEquals("Multiplication overflow", ex.getMessage());
    }

    @Test
    void testDivideSuccess()
    {
        assertEquals(5, myCalc.divide(20, 4));
    }

    @Test
    void testDivideByZero()
    {
        Exception ex = assertThrows(ArithmeticException.class, () -> {myCalc.divide(20, 0);});
        assertEquals("Cannot divide by zero", ex.getMessage());
    }

    @Test
    void testDivideFail()
    {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {myCalc.divide(Integer.MAX_VALUE, Integer.MAX_VALUE);});
        assertEquals("Result is too large", ex.getMessage());
    }
}
