package laboratoryWork.lab14;

import java.util.Arrays;

public class BubbleSorter {
    public static void main(String[] args) {
        int[] ints = {5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(ints));
        sort(ints);
    }

    public static void sort(int[] arr) {
        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
