package week5.lab34toBitStr;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class BigIntegerUtilsTest {

    @Test
    public void test(){
        assertEquals("11000000100011", BigIntegerUtils.toBitStr(new BigInteger("12323")));
        assertEquals("1010101011000", BigIntegerUtils.toBitStr(new BigInteger("5464")));
        assertEquals("10", BigIntegerUtils.toBitStr(new BigInteger("2")));
        assertEquals("1", BigIntegerUtils.toBitStr(new BigInteger("1")));
        assertEquals("0", BigIntegerUtils.toBitStr(new BigInteger("0")));

    }


}
