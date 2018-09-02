package quizs.quiz09;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 7, 9, 2};
        System.out.println(Arrays.toString(arr));
        f(arr);
    }

    public static void f(int[] arr) {
        // this is algorithm bubble
        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
