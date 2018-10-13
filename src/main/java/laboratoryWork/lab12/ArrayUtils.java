package laboratoryWork.lab12;

public class ArrayUtils {
    public static int[] lookFor(int[] array) {
        int[] result = {0, -1};
        int startIndex;
        for (int i = 0; i < array.length; i++)
            if (array[i] > 0) {
                startIndex = i;
                for (; i < array.length; i++) {
                    if (array[i] <= 0) break;
                }
                if (i - 1 - startIndex > result[1] - result[0]) {
                    result[0] = startIndex;
                    result[1] = i - 1;
                }
            }

        if (result[1] == -1) {
            return new int[0];
        } else {
            return result;
        }
    }
}
