package quiz09;

import java.util.Arrays;

public class MainOne {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 5, 3, 2, 9, 7};
        System.out.println(Arrays.toString(ints));
        f(ints);
    }

    public static void f(int[] array) {
        // this is not algorithm
        for (int index = 0; index < array.length - 1; index++) {
            int tmp = array[index];
            array[index] = array[index + 1];
            array[index + 1] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }
}
