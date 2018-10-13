package laboratoryWork.lab13;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0};
        int[] expected = {6, 9};
        int[] actual = ArrayUtils.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
