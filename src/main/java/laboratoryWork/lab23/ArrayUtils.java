package laboratoryWork.lab23;

public class ArrayUtils {
    public static int[][][] rotateClockWise(int[][][] arg) {
        if (arg == null || arg.length == 0 || arg[0] == null || arg[0].length != arg.length || arg[0][0] == null) {
            return null;
        }
        int height = arg[0].length;
        int width = arg.length;
        int length = arg[0][0].length;

        for (int i = 0, j = 0; i < arg.length; i++, j++) {
            if (arg[i].length != width) {
                return null;
            } else if (arg[i] == null) {
                return null;
            }
            for (int k = 0, m = 0; k < arg[i].length; k++, m++) {
                if (arg[i][k].length != arg[i].length) {
                    return null;
                }
            }
        }
        int[][][] result = new int[height][width][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                for (int k = 0; k < length; k++) {
                    result[i][j][k] = arg[k][i][j];
                }
            }
        }
        return result;
    }
}
