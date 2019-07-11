package kz.zhelezyaka.juja.lms;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractSample {
    public void assertArray(String expected, int[] array) {
        assertEquals(expected, Arrays.toString(array));
    }

    public void checkMergeTwoArrays(String expected, int[] result) {
        assertEquals(expected, Arrays.toString(result));
    }
}
