package laboratoryWork.lab12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 1, 1};
        int[] expected = {0, 1};
        int[] actual = ArrayUtils.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
