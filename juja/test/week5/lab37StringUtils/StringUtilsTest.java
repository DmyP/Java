package week5.lab37StringUtils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilsTest {

    @Test
    public void test(){

        assertEquals("BCDEA", StringUtils.rightShift(new String("ABCDE"), -2000000001));
    }


}
