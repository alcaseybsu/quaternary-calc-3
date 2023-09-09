package quaternary3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddBase4() {
        assertEquals( 10320, Calculator.calculate(1223,  "+",  3031 ));
        assertEquals( 10323 , Calculator.calculate( 1231 ,  "+",  3032 ));
        assertEquals( 2303 , Calculator.calculate( 1111 ,  "+",  1132 ));
    }
    @Test
    public void testSubtractBase4() {
        assertEquals( 3, Calculator.calculate( 3 ,  "-",  23 ));
        assertEquals( 0, Calculator.calculate( 1,  "-",  1 ));
        assertEquals( 23123, Calculator.calculate( 32231,  "-",  3102 ));
    }
    @Test
    public void testMultiplyBase4() {
        assertEquals( 13100, Calculator.calculate( 1310,  "x",  10 ));
        assertEquals( 21210, Calculator.calculate( 243,  "x",  24 ));
        assertEquals( 2213130, Calculator.calculate( 1030,  "x",  2031 ));
    }
    //TODO
    @Test
    public void testDivideBase4() {
        assertEquals( 1113 , Calculator.calculate( 3332,  "/",  2 ));
        assertEquals( 10 , Calculator.calculate( 20, "/",  2 ));
        assertEquals( "Error: Division by zero", Calculator.calculate( 3,  "/" ,  0 ));

    }
    @Test
    public void testSquareBase4() {
        assertEquals( 0, Calculator.calculate( 0, "square"));
        assertEquals( 10, Calculator.calculate( 2, "square"));
        assertEquals( 201, Calculator.calculate( 9, "square"));
    }

    @Test
    public void testSquareRootBase4() {
        assertEquals( 2, Calculator.calculate( 4, "root"));
        assertEquals( 2, Calculator.calculate( 256, "root"));
        assertEquals( 12, Calculator.calculate( 9, "root"));
    }
}