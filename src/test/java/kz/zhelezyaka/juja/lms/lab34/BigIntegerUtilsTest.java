package kz.zhelezyaka.juja.lms.lab34;

import laboratoryWork.lab34.BigIntegerUtils;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class BigIntegerUtilsTest {
    @Test
    public void test(){
        assertEquals("11100100000110", BigIntegerUtils.toBitStr(new BigInteger("14598")));
        assertEquals("10", BigIntegerUtils.toBitStr(new BigInteger("2")));
    }
}
