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
    @Test
    void plusTestFor2(){
        //GIVEN
        int n = 2;
        //WHEN
        String actual = Hardcore.plus(n);
        //THEN
        assertEquals("II", actual);
    }
    @Test
    void plusTestFor3(){
        //GIVEN
        int n = 3;
        //WHEN
        String actual = Hardcore.plus(n);
        //THEN
        assertEquals("III", actual);
    }
    @Test
    void plusTestFor6(){
        //GIVEN
        int n = 6;
        //WHEN
        String actual = Hardcore.plus(n);
        //THEN
        assertEquals("VI", actual);
    }
    @Test
    void plusTestFor7(){
        //GIVEN
        int n = 7;
        //WHEN
        String actual = Hardcore.plus(n);
        //THEN
        assertEquals("VII", actual);
    }
    @Test
    void plusTestFor8(){
        //GIVEN
        int n = 8;
        //WHEN
        String actual = Hardcore.plus(n);
        //THEN
        assertEquals("VIII", actual);
    }
    @Test
    void plusTestFor10(){
        //GIVEN
        int n = 10;
        //WHEN
        String actual = Hardcore.plus(n);
        //THEN
        assertEquals("X", actual);
    }
    @Test
    void plusTestFor11(){
        //GIVEN
        int n = 11;
        //WHEN
        String actual = Hardcore.plus(n);
        //THEN
        assertEquals("XI", actual);
    }
    @Test
    void plusTestFor12(){
        //GIVEN
        int n = 12;
        //WHEN
        String actual = Hardcore.plus(n);
        //THEN
        assertEquals("XII", actual);
    }
    @Test
    void plusTestFor13(){
        //GIVEN
        int n = 13;
        //WHEN
        String actual = Hardcore.plus(n);
        //THEN
        assertEquals("XIII", actual);
    }
    @Test
    void plusTestFor16(){
        //GIVEN
        int n = 16;
        //WHEN
        String actual = Hardcore.plus(n);
        //THEN
        assertEquals("XVI", actual);
    }
    @Test
    void plusTestFor17(){
        //GIVEN
        int n = 17;
        //WHEN
        String actual = Hardcore.plus(n);
        //THEN
        assertEquals("XVII", actual);
    }
    @Test
    void plusTestFor18(){
        //GIVEN
        int n = 18;
        //WHEN
        String actual = Hardcore.plus(n);
        //THEN
        assertEquals("XVIII", actual);
    }
}
