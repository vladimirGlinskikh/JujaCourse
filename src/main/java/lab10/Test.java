package lab10;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] result = Merger.merge(new int[]{1}, new int[]{});

        if (!Arrays.equals(result, new int[]{1})) {

            throw new AssertionError();
        }
        System.out.print("OK");
    }
}
