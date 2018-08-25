package kz.zhelezyaka.juja.lms.arrays.lab09;

import kz.zhelezyaka.juja.lms.AbstractSample;
import org.junit.Test;

public class ArrayFilter extends AbstractSample {

    @Test
    public void filterEven() {
        int[] nums = {4, 3, 5, 6, 7, 9};
        int[] res = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                res[j] = nums[i];
                j += 1;
            }
        }
        assertArray("[4, 6, 0, 0, 0, 0]", res);
    }
}
