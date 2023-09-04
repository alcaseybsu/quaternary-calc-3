package quaternary3test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static quaternary3.QuaternaryConverter.convertToBase4;
import static quaternary3.QuaternaryConverter.convertToDecimal;

public class QuaternaryConverterTest {
    @Test
    void convertToDecimalTest() {
        //this is the number 4 in base4
        int base4Number = 10;
        int converter;
        converter = convertToDecimal(base4Number);
        Assertions.assertEquals(4, converter);
    }

    @Test
    void convertToBase4Test() {
        int base10Number = 4;
        String converter = "";
        converter = convertToBase4(base10Number);
        Assertions.assertEquals("10", converter);
    }
    @Test
    void convertToBase4BigNumberTest() {
        int base10Number = 1000000;
        String converter = "";
        converter = convertToBase4(base10Number);
        Assertions.assertEquals("3310021000", converter);
    }
    @Test
    void convertToDecimalBigNumberTest() {
        //this is the number 250000 in base4
        int base4Number = 331002100;
        int converter;
        converter = convertToDecimal(base4Number);
        Assertions.assertEquals(250000, converter);
    }
    @Test
    void convertToBase4ZeroTest() {
        int base10Number = 0;
        String converter = "";
        converter = convertToBase4(base10Number);
        Assertions.assertEquals("0", converter);
    }
}