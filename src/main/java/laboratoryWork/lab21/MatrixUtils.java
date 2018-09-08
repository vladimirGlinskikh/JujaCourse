package laboratoryWork.lab21;

public class MatrixUtils {
    public static void main(String[] args) {
        int[][] a = {{10}};
        int[][] b = {{100}};
        int[][] c = MatrixUtils.mul(a, b);

        if (c.length != 1) {
            throw new AssertionError();
        }
        if (c[0].length != 1) {
            throw new AssertionError();
        }
        if (c[0][0] != a[0][0] * b[0][0]) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }

    public static int[][] mul(int[][] fst, int[][] snd) {
        int one = fst.length;
        int two = snd[0].length;
        int tree = snd.length;
        int[][] result = new int[one][two];

        for (int i = 0; i < one; i++) {
            for (int j = 0; j < two; j++) {
                for (int k = 0; k < tree; k++) {
                    result[i][j] += fst[i][k] * snd[k][j];
                }
            }
        }
        return result;
    }
}
