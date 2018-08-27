package kz.zhelezyaka.juja.lms.arrays.lab10;

import kz.zhelezyaka.juja.lms.AbstractSample;
import org.junit.Test;

public class Merger extends AbstractSample {
    @Test
    public void merge() {
        int[] fst = {2, 3, 5, 7, 1};
        int[] snd = {4, 6, 8};
        int[] result = new int[fst.length + snd.length];

        int fstIndex = fst.length - 1;
        int sndIndex = snd.length - 1;
        int tmp = result.length;

        while (tmp > 0)
            result[--tmp] =
                    (sndIndex < 0 || (fstIndex >= 0 && fst[fstIndex] >= snd[sndIndex]))
                            ? fst[fstIndex--] : snd[sndIndex--];
        checkMergeTwoArrays("[]", result);
    }
}
