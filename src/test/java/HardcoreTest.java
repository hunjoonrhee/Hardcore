import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HardcoreTest {
    @Test
    void convert2RomanNumeralsTestFor1(){
        //GIVEN
        int n = 1;
        //WHEN
        String actual = Hardcore.convert2RomanNumerals(n);
        //THEN
        assertEquals("I", actual);
    }
    @Test
    void convert2RomanNumeralsTestFor5(){
        //GIVEN
        int n = 5;
        //WHEN
        String actual = Hardcore.convert2RomanNumerals(n);
        //THEN
        assertEquals("V", actual);
    }
    @Test
    void convert2RomanNumeralsTestFor10(){
        //GIVEN
        int n = 10;
        //WHEN
        String actual = Hardcore.convert2RomanNumerals(n);
        //THEN
        assertEquals("X", actual);
    }
    @Test
    void convert2RomanNumeralsTestFor30(){
        //GIVEN
        int n = 30;
        //WHEN
        String actual = Hardcore.convert2RomanNumerals(n);
        //THEN
        assertEquals("XXX", actual);
    }
    @Test
    void convert2RomanNumeralsTestFor50(){
        //GIVEN
        int n = 50;
        //WHEN
        String actual = Hardcore.convert2RomanNumerals(n);
        //THEN
        assertEquals("L", actual);
    }
    @Test
    void convert2RomanNumeralsTestFor100(){
        //GIVEN
        int n = 100;
        //WHEN
        String actual = Hardcore.convert2RomanNumerals(n);
        //THEN
        assertEquals("C", actual);
    }
}
