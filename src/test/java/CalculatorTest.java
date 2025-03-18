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


}
