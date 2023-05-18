////////////////////////////////////////////////////////////////////
// Matteo Stocco 2000552
// Alessandro Carraro 2000548
////////////////////////////////////////////////////////////////////
package test.java.it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {
    @Test(expected = IllegalArgumentException.class)
    public void test_Excepion(){
        IntegerToRoman.convert(0);
        IntegerToRoman.convert(1001);
        IntegerToRoman.convert(1);
    }
    
    @Test
    public void test_Basic_Number() {
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("X", IntegerToRoman.convert(10));
        assertEquals("L", IntegerToRoman.convert(50));
        assertEquals("C", IntegerToRoman.convert(100));
        assertEquals("D", IntegerToRoman.convert(500));
        assertEquals("M", IntegerToRoman.convert(1000));

        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("III", IntegerToRoman.convert(3));
        assertEquals("XX", IntegerToRoman.convert(20));
        assertEquals("XXX", IntegerToRoman.convert(30));
        assertEquals("CC", IntegerToRoman.convert(200));
        assertEquals("CCC", IntegerToRoman.convert(300));

        assertEquals("DCCCLXXXVIII", IntegerToRoman.convert(888));
    }
    
    @Test
    public void test_Fours_Number() {
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("XLIV", IntegerToRoman.convert(44));
        assertEquals("CD", IntegerToRoman.convert(400));
        assertEquals("CDXLIV", IntegerToRoman.convert(444));
    }
    
    @Test
    public void test_Nines_Number() {
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("XC", IntegerToRoman.convert(90));
        assertEquals("XCIX", IntegerToRoman.convert(99));
        assertEquals("CM", IntegerToRoman.convert(900));
        assertEquals("CMXCIX", IntegerToRoman.convert(999));
    }
}