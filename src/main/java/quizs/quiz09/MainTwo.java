package quizs.quiz09;

import java.util.Arrays;

public class MainTwo {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 9, 7, 2, 4, 5};
        System.out.println(Arrays.toString(ints));
        f(ints);
    }

    public static void f(int[] array) {
        // this is not algorithm
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] > array[index + 1]) {
                int tmp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = tmp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
