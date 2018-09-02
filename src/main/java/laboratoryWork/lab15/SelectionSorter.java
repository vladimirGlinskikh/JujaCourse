package laboratoryWork.lab15;

import java.util.Arrays;

public class SelectionSorter {
    public static void main(String[] args) {
        int[] ints = {5, 8, 1, 2, 4, 3};
        System.out.println(Arrays.toString(ints));
        sort(ints);
    }

    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[barrier] > arr[index]) {
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
