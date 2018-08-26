package lab10;

import java.util.Arrays;
//Это не правильный вариант.
// Взято отсюда: https://ru.stackoverflow.com/questions/521219/%D0%A1%D0%BB%D0%B8%D1%8F%D0%BD%D0%B8%D0%B5-%D0%BE%D1%82%D1%81%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D1%85-%D0%BC%D0%B0%D1%81%D1%81%D0%B8%D0%B2%D0%BE%D0%B2-%D0%9E%D1%88%D0%B8%D0%B1%D0%BA%D0%B0-%D1%80%D0%B5%D0%B0%D0%BB%D0%B8%D0%B7%D0%B0%D1%86%D0%B8%D0%B8
public class Merger {
    public static void main(String[] args) {
        int[] a = {2, 7, 9};
        int[] b = {0, 2, 4};

        int[] res = merge(a, b);
        System.out.println(Arrays.toString(res));
    }

    public static int[] merge(int[] fst, int[] snd) {
        int[] result = new int[fst.length + snd.length];
        int fstIndex = 0;
        int sndIndex = 0;
        int i = 0;
        while (i < result.length) {
            result[i] = fst[fstIndex] < snd[sndIndex] ? fst[fstIndex++] : snd[sndIndex++];
            if (fstIndex == fst.length) {
                System.arraycopy(snd, sndIndex, result, ++i, snd.length - sndIndex);
                break;
            }
            if (sndIndex == snd.length) {
                System.arraycopy(fst, fstIndex, result, ++i, fst.length - fstIndex);
                break;
            }
            i++;
        }
        return result;
    }
}
