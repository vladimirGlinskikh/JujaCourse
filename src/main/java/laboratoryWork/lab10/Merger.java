package laboratoryWork.lab10;

public class Merger {

    public static int[] merge(int[] fst, int[] snd) {
        int[] result = new int[fst.length + snd.length];

        int fstIndex = fst.length - 1;
        int sndIndex = snd.length - 1;
        int tmp = result.length;

        while (tmp > 0)
            result[--tmp] =
                    (sndIndex < 0 || (fstIndex >= 0 && fst[fstIndex] >= snd[sndIndex]))
                            ? fst[fstIndex--] : snd[sndIndex--];
        return result;
    }
}
