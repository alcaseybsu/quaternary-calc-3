package quaternary3test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void calculate() {
    }

    @Test
    void testCalculate() {
    }
    
    @Test
    public void testAddition() {
        String result = Calculator.calculate(10, "+", 5);
        assertEquals("23", result);
    }

    @Test
    public void testSubtraction() {
        String result = Calculator.calculate(10, "-", 5);
        assertEquals("5", result);
    }

    @Test
    public void testMultiplication() {
        String result = Calculator.calculate(10, "x", 5);
        assertEquals("32", result);
    }

    @Test
    public void testDivision() {
        String result = Calculator.calculate(10, "/", 5);
        assertEquals("2", result);
    }

    @Test
    public void testSquare() {
        String result = Calculator.calculate(4, "square");
        assertEquals("20", result);
    }

    @Test
    public void testSquareRoot() {
        String result = Calculator.calculate(16, "root");
        assertEquals("2", result);
    }
