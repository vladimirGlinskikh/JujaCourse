package laboratoryWork.lab22;

import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {
        int[][] oldArray = {
                {0, 1},
                {2, 3}};
        int[][] newExpectedArray = {
                {2, 0},
                {3, 1}};
        int[][] newActualArray = ArrayUtils.rotateClockwise(oldArray);

        if (!Arrays.deepEquals(newActualArray, newExpectedArray)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }

    public static int[][] rotateClockwise(int[][] arg) {
        if (arg == null || arg.length == 0) {
            return null;
        } else {
            for (int[] anArg : arg) {
                if (anArg == null || anArg.length == 0 || anArg.length != arg.length) {
                    return null;
                }
            }
        }
        int[][] newArray = new int[arg[0].length][arg.length];

        for (int i = 0; i < arg[0].length; i++) {
            for (int j = 0; j < arg[i].length; j++) {
                newArray[j][arg.length - 1 - i] = arg[i][j];
            }
        }
        return newArray;
    }
}
