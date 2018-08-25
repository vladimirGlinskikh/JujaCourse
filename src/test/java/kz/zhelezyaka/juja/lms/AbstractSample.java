package kz.zhelezyaka.juja.lms;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class AbstractSample {
    public void assertArray(String expected, int[] array) {
        assertEquals(expected, Arrays.toString(array));
    }
}
