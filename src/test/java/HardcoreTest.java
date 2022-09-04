import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HardcoreTest {
    @Test
    void convert2RomanNumeralsFor3(){
        //GIVEN
        int n = 3;
        //WHEN
        String actual = Hardcore.convert2RomanNumerals(n);
        //THEN
        assertEquals("III", actual);
    }
    @Test
    void convert2RomanNumeralsFor8(){
        //GIVEN
        int n = 8;
        //WHEN
        String actual = Hardcore.convert2RomanNumerals(n);
        //THEN
        assertEquals("VIII", actual);
    }
    @Test
    void convert2RomanNumeralsFor10(){
        //GIVEN
        int n = 10;
        //WHEN
        String actual = Hardcore.convert2RomanNumerals(n);
        //THEN
        assertEquals("X", actual);
    }
    @Test
    void convert2RomanNumeralsFor11(){
        //GIVEN
        int n = 11;
        //WHEN
        String actual = Hardcore.convert2RomanNumerals(n);
        //THEN
        assertEquals("XI", actual);
    }
    @Test
    void convert2RomanNumeralsFor12(){
        //GIVEN
        int n = 12;
        //WHEN
        String actual = Hardcore.convert2RomanNumerals(n);
        //THEN
        assertEquals("XII", actual);
    }
    @Test
    void convert2RomanNumeralsFor18(){
        //GIVEN
        int n = 18;
        //WHEN
        String actual = Hardcore.convert2RomanNumerals(n);
        //THEN
        assertEquals("XVIII", actual);
    }
    @Test
    void convert2RomanNumeralsFor20(){
        //GIVEN
        int n = 20;
        //WHEN
        String actual = Hardcore.convert2RomanNumerals(n);
        //THEN
        assertEquals("XX", actual);
    }

    @Test
    void convert2RomanNumeralsFor50(){
        //GIVEN
        int n = 50;
        //WHEN
        String actual = Hardcore.convert2RomanNumerals(n);
        //THEN
        assertEquals("L", actual);
    }
    @Test
    void convert2RomanNumeralsFor59(){
        //GIVEN
        int n = 59;
        //WHEN
        String actual = Hardcore.convert2RomanNumerals(n);
        //THEN
        assertEquals("LIX", actual);
    }
    @Test
    void convert2RomanNumeralsFor55(){
        //GIVEN
        int n = 55;
        //WHEN
        String actual = Hardcore.convert2RomanNumerals(n);
        //THEN
        assertEquals("LV", actual);
    }
    @Test
    void convert2RomanNumeralsFor80(){
        //GIVEN
        int n = 80;
        //WHEN
        String actual = Hardcore.convert2RomanNumerals(n);
        //THEN
        assertEquals("LXXX", actual);
    }

    @Test
    void convert2RomanNumeralsFor85(){
        //GIVEN
        int n = 85;
        //WHEN
        String actual = Hardcore.convert2RomanNumerals(n);
        //THEN
        assertEquals("LXXXV", actual);
    }

    @Test
    void convert2RomanNumeralsFor90(){
        //GIVEN
        int n = 90;
        //WHEN
        String actual = Hardcore.convert2RomanNumerals(n);
        //THEN
        assertEquals("XC", actual);
    }
    @Test
    void convert2RomanNumeralsFor97(){
        //GIVEN
        int n = 97;
        //WHEN
        String actual = Hardcore.convert2RomanNumerals(n);
        //THEN
        assertEquals("XCVII", actual);
    }
    @Test
    void convert2RomanNumeralsFor100(){
        //GIVEN
        int n = 100;
        //WHEN
        String actual = Hardcore.convert2RomanNumerals(n);
        //THEN
        assertEquals("C", actual);
    }
}
