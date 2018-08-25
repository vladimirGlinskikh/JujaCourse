package kz.zhelezyaka.juja.lms.arrays.quiz07;

import kz.zhelezyaka.juja.lms.AbstractSample;
import org.junit.Test;

public class Application extends AbstractSample {
    @Test
    public void invertOne() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int k = 0; k < arr.length / 2; k++) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
        }
        assertArray("[5, 4, 3, 2, 1]", arr);
    }

    @Test
    public void invertTwo() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int k = 0; k <= arr.length / 2; k++) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
        }
        assertArray("[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]", arr);
    }

    @Test
    public void invertThree() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int k = 0; k < arr.length / 2; k++) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k];
            arr[arr.length - k] = tmp;
        }
        assertArray("[5, 4, 3, 2, 1]", arr);
    }

    @Test
    public void invertFour() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int k = 0; k < arr.length / 2; k++) {
            int tmp = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = arr[k];
            arr[k] = tmp;
        }
        assertArray("[5, 4, 3, 2, 1]", arr);
    }

    @Test
    public void invertFive() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int k = 0; k < arr.length / 2; k++) {
            int tmp = arr[arr.length - k];
            arr[arr.length - k] = arr[k];
            arr[k] = tmp;
        }
        assertArray("[5, 4, 3, 2, 1]", arr);
    }
}
