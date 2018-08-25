package kz.zhelezyaka.juja.lms.arrays.lab08;

import kz.zhelezyaka.juja.lms.AbstractSample;
import org.junit.Test;

public class ArrayInverter extends AbstractSample {

    @Test
    public void invert() {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int k = arr.length / 2 - 1; k >= 0; k--) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
        }
        assertArray("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", arr);
    }
}
